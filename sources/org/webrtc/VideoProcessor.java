package org.webrtc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public interface VideoProcessor extends CapturerObserver {

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i7, int i10, int i11, int i12, int i13, int i14, long j3, boolean z9) {
            this.cropX = i7;
            this.cropY = i10;
            this.cropWidth = i11;
            this.cropHeight = i12;
            this.scaleWidth = i13;
            this.scaleHeight = i14;
            this.timestampNs = j3;
            this.drop = z9;
        }
    }

    void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters);

    void setSink(VideoSink videoSink);
}
