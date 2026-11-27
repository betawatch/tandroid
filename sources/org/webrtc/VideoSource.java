package org.webrtc;

import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    class 1 implements CapturerObserver {
        public 1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCapturerStarted$0(boolean z) {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(z);
            synchronized (VideoSource.this.videoProcessorLock) {
                VideoSource.this.isCapturerRunning = z;
                if (VideoSource.this.videoProcessor != null) {
                    VideoSource.this.videoProcessor.onCapturerStarted(z);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCapturerStopped$1() {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
            synchronized (VideoSource.this.videoProcessorLock) {
                VideoSource.this.isCapturerRunning = false;
                if (VideoSource.this.videoProcessor != null) {
                    VideoSource.this.videoProcessor.onCapturerStopped();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onFrameCaptured$2(VideoFrame videoFrame) {
            VideoProcessor.FrameAdaptationParameters adaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
            synchronized (VideoSource.this.videoProcessorLock) {
                if (VideoSource.this.videoProcessor != null) {
                    VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, adaptFrame);
                    return;
                }
                VideoFrame videoFrame2 = adaptFrame.drop ? null : new VideoFrame(videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight), videoFrame.getRotation(), adaptFrame.timestampNs);
                if (videoFrame2 != null) {
                    VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame2);
                    videoFrame2.release();
                }
            }
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(final boolean z) {
            VideoSource.this.runWithReference(new Runnable() { // from class: org.webrtc.j
                @Override // java.lang.Runnable
                public final void run() {
                    VideoSource.1.this.lambda$onCapturerStarted$0(z);
                }
            });
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            VideoSource.this.runWithReference(new Runnable() { // from class: org.webrtc.k
                @Override // java.lang.Runnable
                public final void run() {
                    VideoSource.1.this.lambda$onCapturerStopped$1();
                }
            });
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            VideoSource.this.runWithReference(new f(this, videoFrame, (byte) 1));
        }
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public VideoSource(long j) {
        super(j);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new 1();
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$adaptOutputFormat$0(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsScreencast$1(boolean z) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$2(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$3(VideoFrame videoFrame) {
        runWithReference(new g9c(this, videoFrame, (byte) 23));
    }

    public void adaptOutputFormat(int i, int i2, int i3, int i4, int i5) {
        adaptOutputFormat(new AspectRatio(i, i2), Integer.valueOf(i2 * i), new AspectRatio(i3, i4), Integer.valueOf(i4 * i3), Integer.valueOf(i5));
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z) {
        runWithReference(new q38((byte) 26, (Object) this, z));
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            VideoProcessor videoProcessor2 = this.videoProcessor;
            if (videoProcessor2 != null) {
                videoProcessor2.setSink(null);
                if (this.isCapturerRunning) {
                    this.videoProcessor.onCapturerStopped();
                }
            }
            this.videoProcessor = videoProcessor;
            if (videoProcessor != null) {
                videoProcessor.setSink(new c01(this, (byte) 2));
                if (this.isCapturerRunning) {
                    videoProcessor.onCapturerStarted(true);
                }
            }
        }
    }

    public void adaptOutputFormat(int i, int i2, int i3) {
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        adaptOutputFormat(max, min, min, max, i3);
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        runWithReference(new esa(this, aspectRatio, num, aspectRatio2, num2, num3, (byte) 9));
    }
}
