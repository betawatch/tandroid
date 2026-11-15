package org.webrtc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
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
    public void setTargets(int i7, double d) {
        this.targetBitrateBps = i7;
        this.targetFramerateFps = d;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i7) {
    }
}
