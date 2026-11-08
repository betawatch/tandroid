package org.webrtc.voiceengine;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import jg.g;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecord Instance = null;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private int captureType;
    private AudioRecord deviceAudioRecord;
    private ByteBuffer deviceByteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;
    private int requestedSampleRate = 48000;
    private int requestedChannels = 1;

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                int read2 = WebRtcAudioRecord.this.deviceAudioRecord != null ? WebRtcAudioRecord.this.deviceAudioRecord.read(WebRtcAudioRecord.this.deviceByteBuffer, WebRtcAudioRecord.this.deviceByteBuffer.capacity()) : 0;
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (read == read2) {
                        WebRtcAudioRecord.this.deviceByteBuffer.position(0);
                        WebRtcAudioRecord.this.byteBuffer.position(0);
                        for (int i7 = 0; i7 < read / 2; i7++) {
                            int i10 = i7 * 2;
                            int i11 = (WebRtcAudioRecord.this.deviceByteBuffer.getShort(i10) / 10) + WebRtcAudioRecord.this.byteBuffer.getShort(i10);
                            if (i11 > 32767) {
                                i11 = 32767;
                            }
                            if (i11 < -32768) {
                                i11 = -32768;
                            }
                            WebRtcAudioRecord.this.byteBuffer.putShort(i10, (short) i11);
                        }
                    }
                    if (this.keepAlive) {
                        try {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                        } catch (UnsatisfiedLinkError e10) {
                            a8.g(e10, true);
                            this.keepAlive = false;
                        }
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e11) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e11.getMessage());
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j3, int i7) {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j3;
        this.effects = WebRtcAudioEffects.create();
        this.captureType = i7;
        if (i7 == 2 && Instance == null) {
            Instance = this;
        }
    }

    private static void assertTrue(boolean z9) {
        if (!z9) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i7) {
        return i7 == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z9) {
        Logging.d(TAG, "enableBuiltInAEC(" + z9 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z9);
        }
        Logging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z9) {
        Logging.d(TAG, "enableBuiltInNS(" + z9 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z9);
        }
        Logging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i7, int i10) {
        WebRtcAudioEffects webRtcAudioEffects;
        if (this.captureType != 1 || Build.VERSION.SDK_INT >= 29) {
            this.requestedSampleRate = i7;
            this.requestedChannels = i10;
            Logging.d(TAG, "initRecording(sampleRate=" + i7 + ", channels=" + i10 + ")");
            if (this.audioRecord != null) {
                reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
                return -1;
            }
            int i11 = i7 / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * 2 * i11);
            this.byteBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int channelCountToConfiguration = channelCountToConfiguration(i10);
            int minBufferSize = AudioRecord.getMinBufferSize(i7, channelCountToConfiguration, 2);
            if (minBufferSize == -1 || minBufferSize == -2) {
                reportWebRtcAudioRecordInitError(g.j(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
                return -1;
            }
            Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            Logging.d(TAG, "bufferSizeInBytes: " + max);
            if (this.captureType != 1) {
                try {
                    this.audioRecord = new AudioRecord(audioSource, i7, channelCountToConfiguration, 2, max);
                } catch (IllegalArgumentException e10) {
                    reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e10.getMessage());
                    releaseAudioResources(false);
                    return -1;
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                try {
                    MediaProjection mediaProjection = VideoCapturerDevice.getMediaProjection();
                    if (mediaProjection != null) {
                        AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
                        builder.addMatchingUsage(1);
                        builder.addMatchingUsage(14);
                        builder.addMatchingUsage(0);
                        AudioRecord.Builder builder2 = new AudioRecord.Builder();
                        builder2.setAudioPlaybackCaptureConfig(builder.build());
                        builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(channelCountToConfiguration).setSampleRate(i7).setEncoding(2).build());
                        builder2.setBufferSizeInBytes(max);
                        this.audioRecord = builder2.build();
                    }
                } catch (Throwable th2) {
                    reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th2.getMessage());
                    releaseAudioResources(false);
                    return -1;
                }
            }
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources(false);
                return -1;
            }
            if (this.captureType == 0 && (webRtcAudioEffects = this.effects) != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i11;
        }
        return -1;
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i7, long j3);

    private void onDestroy() {
        stopDeviceAudioRecord();
        if (Instance == this) {
            Instance = null;
        }
    }

    private void releaseAudioResources(boolean z9) {
        Logging.d(TAG, "releaseAudioResources " + z9);
        if (z9) {
            AudioRecord audioRecord = this.deviceAudioRecord;
            if (audioRecord != null) {
                audioRecord.release();
                this.deviceAudioRecord = null;
                return;
            }
            return;
        }
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            audioRecord2.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i7) {
        synchronized (WebRtcAudioRecord.class) {
            Logging.w(TAG, "Audio source is changed from: " + audioSource + " to " + i7);
            audioSource = i7;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z9) {
        Logging.w(TAG, "setMicrophoneMute(" + z9 + ")");
        microphoneMute = z9;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() == 3) {
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                return true;
            }
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
            return false;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        try {
            this.audioRecord.stop();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        releaseAudioResources(false);
        return true;
    }

    public void initDeviceAudioRecord(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((this.requestedSampleRate / 100) * this.requestedChannels * 2);
        this.deviceByteBuffer = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        int channelCountToConfiguration = channelCountToConfiguration(this.requestedChannels);
        int minBufferSize = AudioRecord.getMinBufferSize(this.requestedSampleRate, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(g.j(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return;
        }
        int max = Math.max(minBufferSize * 2, this.deviceByteBuffer.capacity());
        try {
            AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
            builder.addMatchingUsage(1);
            builder.addMatchingUsage(14);
            AudioRecord.Builder builder2 = new AudioRecord.Builder();
            builder2.setAudioPlaybackCaptureConfig(builder.build());
            builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(channelCountToConfiguration).setSampleRate(this.requestedSampleRate).setEncoding(2).build());
            builder2.setBufferSizeInBytes(max);
            AudioRecord build = builder2.build();
            this.deviceAudioRecord = build;
            if (build == null || build.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources(true);
                return;
            }
            try {
                this.deviceAudioRecord.startRecording();
                if (this.deviceAudioRecord.getRecordingState() != 3) {
                    reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.deviceAudioRecord.getRecordingState());
                }
            } catch (IllegalStateException e10) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
            }
        } catch (Throwable th2) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th2.getMessage());
            releaseAudioResources(true);
        }
    }

    public void stopDeviceAudioRecord() {
        AudioRecord audioRecord = this.deviceAudioRecord;
        if (audioRecord == null) {
            return;
        }
        try {
            audioRecord.stop();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        releaseAudioResources(true);
    }
}
