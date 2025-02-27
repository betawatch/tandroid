package org.webrtc;

/* loaded from: classes5.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    FramerateBitrateAdjuster() {
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        this.targetFramerateFps = 30.0d;
        double d2 = i * 30;
        Double.isNaN(d2);
        this.targetBitrateBps = (int) (d2 / d);
    }
}
