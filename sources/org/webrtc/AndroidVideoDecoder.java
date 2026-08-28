package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import j3.r0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;
import ru.noties.jlatexmath.android.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j10, Integer num) {
            this.presentationTimestampUs = j10;
            this.decodeTimeMs = num;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j10, int i9) {
            this.decodeStartTimeMs = j10;
            this.rotation = i9;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i9, EglBase.Context context) {
        if (!isSupportedColorFormat(i9)) {
            throw new IllegalArgumentException(r0.l(i9, "Unsupported color format: "));
        }
        Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i9 + " context: " + context);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i9;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i9, int i10, int i11, int i12) {
        if (i9 % 2 != 0) {
            throw new AssertionError(r0.l(i9, "Stride is not divisible by two: "));
        }
        int i13 = (i11 + 1) / 2;
        int i14 = i10 % 2 == 0 ? (i12 + 1) / 2 : i12 / 2;
        int i15 = i9 / 2;
        int i16 = i9 * i12;
        int i17 = i9 * i10;
        int i18 = i15 * i14;
        int i19 = i17 + i18;
        int i20 = ((i15 * i10) / 2) + i17;
        int i21 = i20 + i18;
        VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i11, i12);
        try {
            byteBuffer.limit(i16);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i9, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i11, i12);
            byteBuffer.limit(i19);
            byteBuffer.position(i17);
            copyPlane(byteBuffer.slice(), i15, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i13, i14);
            if (i10 % 2 == 1) {
                byteBuffer.position(((i14 - 1) * i15) + i17);
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i14);
                dataU.put(byteBuffer);
            }
            byteBuffer.limit(i21);
            byteBuffer.position(i20);
            copyPlane(byteBuffer.slice(), i15, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i13, i14);
            if (i10 % 2 == 1) {
                byteBuffer.position(((i14 - 1) * i15) + i20);
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i14);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        } catch (Throwable th) {
            FileLog.e(th);
            return allocateI420Buffer;
        }
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i9, int i10, int i11, int i12) {
        return new NV12Buffer(i11, i12, i9, i10, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i9, MediaCodec.BufferInfo bufferInfo, int i10, Integer num) {
        int i11;
        int i12;
        int i13;
        int i14;
        AndroidVideoDecoder androidVideoDecoder;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            try {
                i11 = this.width;
                i12 = this.height;
                i13 = this.stride;
                i14 = this.sliceHeight;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        int i15 = bufferInfo.size;
        if (i15 < ((i11 * i12) * 3) / 2) {
            Logging.e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        if (i15 < ((i13 * i12) * 3) / 2 && i14 == i12 && i13 > i11) {
            i13 = (i15 * 2) / (i12 * 3);
        }
        int i16 = i13;
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i9);
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        if (this.colorFormat == 19) {
            androidVideoDecoder = this;
            copyNV12ToI420Buffer = androidVideoDecoder.copyI420Buffer(slice, i16, i14, i11, i12);
        } else {
            androidVideoDecoder = this;
            copyNV12ToI420Buffer = androidVideoDecoder.copyNV12ToI420Buffer(slice, i16, i14, i11, i12);
        }
        androidVideoDecoder.codec.releaseOutputBuffer(i9, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i10, bufferInfo.presentationTimeUs * 1000);
        androidVideoDecoder.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i9, MediaCodec.BufferInfo bufferInfo, int i10, Integer num) {
        int i11;
        int i12;
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i9, false);
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i11, i12);
                this.surfaceTextureHelper.setFrameRotation(i10);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i9, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i9, int i10) {
        this.decoderThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i9 + " height: " + i10 + " color format: " + this.colorFormat);
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i9;
        this.height = i10;
        this.stride = i9;
        this.sliceHeight = i10;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i9, i10);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e10) {
                e = e10;
                Logging.e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e11) {
                e = e11;
                Logging.e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            Logging.e(TAG, "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i9) {
        for (int i10 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Decoder format changed: " + mediaFormat);
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                if (integer == this.width) {
                    if (integer2 != this.height) {
                    }
                    if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                        this.colorFormat = mediaFormat.getInteger("color-format");
                        Logging.d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                        if (!isSupportedColorFormat(this.colorFormat)) {
                            stopOnOutputThread(new IllegalStateException("Unsupported color format: " + this.colorFormat));
                            return;
                        }
                    }
                    synchronized (this.dimensionLock) {
                        try {
                            if (mediaFormat.containsKey("stride")) {
                                this.stride = mediaFormat.getInteger("stride");
                            }
                            if (mediaFormat.containsKey("slice-height")) {
                                this.sliceHeight = mediaFormat.getInteger("slice-height");
                            }
                            Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                            this.stride = Math.max(this.width, this.stride);
                            this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        } finally {
                        }
                    }
                    return;
                }
                if (this.hasDecodedFirstFrame) {
                    stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2));
                    return;
                }
                if (integer > 0 && integer2 > 0) {
                    this.width = integer;
                    this.height = integer2;
                    if (this.surfaceTextureHelper == null) {
                        this.colorFormat = mediaFormat.getInteger("color-format");
                        Logging.d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                        if (!isSupportedColorFormat(this.colorFormat)) {
                        }
                    }
                    synchronized (this.dimensionLock) {
                    }
                }
                Logging.w(TAG, "Unexpected format dimensions. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2 + ". Skip it");
            } finally {
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i9, int i10) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            return VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i9, int i10) {
        return JavaI420Buffer.allocate(i9, i10);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        YuvHelper.copyPlane(byteBuffer, i9, byteBuffer2, i10, i11, i12);
    }

    @Override // org.webrtc.VideoDecoder
    public final /* synthetic */ long createNative(long j10) {
        return u.a(this, j10);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i9;
        int i10;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.codec == null || this.callback == null) {
            StringBuilder sb2 = new StringBuilder("decode uninitalized, codec: ");
            sb2.append(this.codec != null);
            sb2.append(", callback: ");
            sb2.append(this.callback);
            Logging.d(TAG, sb2.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i9 = this.width;
            i10 = this.height;
        }
        int i11 = encodedImage.encodedWidth;
        int i12 = encodedImage.encodedHeight;
        if (i11 * i12 > 0 && ((i11 != i9 || i12 != i10) && (reinitDecode = reinitDecode(i11, i12)) != VideoCodecStatus.OK)) {
            return reinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            Logging.e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (dequeueInputBuffer < 0) {
                Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                if (inputBuffer.capacity() < remaining) {
                    Logging.e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e10) {
                    Logging.e(TAG, "queueInputBuffer failed", e10);
                    this.frameInfos.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e11) {
                Logging.e(TAG, "getInputBuffer with index=" + dequeueInputBuffer + " failed", e11);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e12) {
            Logging.e(TAG, "dequeueInputBuffer failed", e12);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() {
        Integer num;
        int i9;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
                return;
            }
            FrameInfo poll = this.frameInfos.poll();
            if (poll != null) {
                num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                i9 = poll.rotation;
            } else {
                num = null;
                i9 = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i9, num);
            } else {
                deliverByteFrame(dequeueOutputBuffer, bufferInfo, i9, num);
            }
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverDecodedFrame failed", e10);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j10;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j10 = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j10), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, BuildConfig.BUILD_TYPE);
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    @Override // org.webrtc.VideoSink
    public final /* synthetic */ void setParentSink(VideoSink videoSink) {
        e0.a(this, videoSink);
    }
}
