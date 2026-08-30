package org.webrtc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public void reportEncodedFrame(int i10) {
        double d = this.targetFramerateFps;
        if (d == 0.0d) {
            return;
        }
        int i11 = this.targetBitrateBps;
        double d10 = (i10 - ((i11 / BITS_PER_BYTE) / d)) + this.deviationBytes;
        this.deviationBytes = d10;
        this.timeSinceLastAdjustmentMs = (1000.0d / d) + this.timeSinceLastAdjustmentMs;
        double d11 = i11 / BITS_PER_BYTE;
        double d12 = BITRATE_ADJUSTMENT_SEC * d11;
        double min = Math.min(d10, d12);
        this.deviationBytes = min;
        double max = Math.max(min, -d12);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d11) {
            int i12 = this.bitrateAdjustmentScaleExp - ((int) ((max / d11) + 0.5d));
            this.bitrateAdjustmentScaleExp = i12;
            this.bitrateAdjustmentScaleExp = Math.max(i12, -20);
            this.deviationBytes = d11;
        } else {
            double d13 = -d11;
            if (max < d13) {
                int i13 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d11) + 0.5d));
                this.bitrateAdjustmentScaleExp = i13;
                this.bitrateAdjustmentScaleExp = Math.min(i13, 20);
                this.deviationBytes = d13;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i10, double d) {
        int i11 = this.targetBitrateBps;
        if (i11 > 0 && i10 < i11) {
            this.deviationBytes = (this.deviationBytes * i10) / i11;
        }
        super.setTargets(i10, d);
    }
}
