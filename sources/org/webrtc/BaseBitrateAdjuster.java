package org.webrtc;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        this.targetBitrateBps = i;
        this.targetFramerateFps = d;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i) {
    }
}
