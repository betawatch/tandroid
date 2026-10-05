package org.webrtc;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public interface VideoProcessor extends CapturerObserver {

    /* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i10, int i11, int i12, int i13, int i14, int i15, long j3, boolean z10) {
            this.cropX = i10;
            this.cropY = i11;
            this.cropWidth = i12;
            this.cropHeight = i13;
            this.scaleWidth = i14;
            this.scaleHeight = i15;
            this.timestampNs = j3;
            this.drop = z10;
        }
    }

    void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters);

    void setSink(VideoSink videoSink);
}
