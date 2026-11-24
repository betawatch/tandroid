package org.webrtc;

import org.webrtc.VideoProcessor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        this.capturerObserver = new CapturerObserver() { // from class: org.webrtc.VideoSource.1
            @Override // org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(z);
                synchronized (VideoSource.this.videoProcessorLock) {
                    VideoSource.this.isCapturerRunning = z;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStarted(z);
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    VideoSource.this.isCapturerRunning = false;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStopped();
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
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
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(VideoFrame videoFrame) {
        runWithReference(new x4c(this, videoFrame, (byte) 29));
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
        this.nativeAndroidVideoTrackSource.setIsScreencast(z);
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
                videoProcessor.setSink(new b11(this, (byte) 2));
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
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
