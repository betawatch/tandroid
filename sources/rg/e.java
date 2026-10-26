package rg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e extends m {
    @Override // rg.m
    public final float a() {
        return 0.7f;
    }

    @Override // rg.m
    public final int c() {
        return -13318311;
    }

    @Override // rg.m
    public final float d() {
        return 0.5f;
    }

    @Override // rg.m
    public final int e() {
        return R.raw.photo_neon;
    }

    @Override // rg.m
    public final float g() {
        return 0.2f;
    }

    @Override // rg.m
    public final float h() {
        return 1.45f;
    }

    @Override // rg.m
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskLight";
        }
        if (i10 == 1) {
            return "compositeWithMaskLight";
        }
        if (i10 != 2) {
            return null;
        }
        return "brushLight";
    }

    @Override // rg.m
    public final float k() {
        return 0.07f;
    }

    @Override // rg.m
    public final int l() {
        return R.drawable.paint_neon_brush;
    }
}
