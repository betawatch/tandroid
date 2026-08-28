package org.webrtc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i9) {
        double d = this.targetFramerateFps;
        if (d == 0.0d) {
            return;
        }
        int i10 = this.targetBitrateBps;
        double d9 = (i9 - ((i10 / BITS_PER_BYTE) / d)) + this.deviationBytes;
        this.deviationBytes = d9;
        this.timeSinceLastAdjustmentMs = (1000.0d / d) + this.timeSinceLastAdjustmentMs;
        double d10 = i10 / BITS_PER_BYTE;
        double d11 = BITRATE_ADJUSTMENT_SEC * d10;
        double min = Math.min(d9, d11);
        this.deviationBytes = min;
        double max = Math.max(min, -d11);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d10) {
            int i11 = this.bitrateAdjustmentScaleExp - ((int) ((max / d10) + 0.5d));
            this.bitrateAdjustmentScaleExp = i11;
            this.bitrateAdjustmentScaleExp = Math.max(i11, -20);
            this.deviationBytes = d10;
        } else {
            double d12 = -d10;
            if (max < d12) {
                int i12 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d10) + 0.5d));
                this.bitrateAdjustmentScaleExp = i12;
                this.bitrateAdjustmentScaleExp = Math.min(i12, 20);
                this.deviationBytes = d12;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i9, double d) {
        int i10 = this.targetBitrateBps;
        if (i10 > 0 && i9 < i10) {
            this.deviationBytes = (this.deviationBytes * i9) / i10;
        }
        super.setTargets(i9, d);
    }
}
