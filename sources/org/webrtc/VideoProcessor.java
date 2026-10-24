package org.webrtc;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public interface VideoProcessor extends CapturerObserver {

    /* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i10, int i11, int i12, int i13, int i14, int i15, long j10, boolean z10) {
            this.cropX = i10;
            this.cropY = i11;
            this.cropWidth = i12;
            this.cropHeight = i13;
            this.scaleWidth = i14;
            this.scaleHeight = i15;
            this.timestampNs = j10;
            this.drop = z10;
        }
    }

    void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters);

    void setSink(VideoSink videoSink);
}
