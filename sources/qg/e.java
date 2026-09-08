package qg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e extends m {
    @Override // qg.m
    public final float a() {
        return 0.7f;
    }

    @Override // qg.m
    public final int c() {
        return -13318311;
    }

    @Override // qg.m
    public final float d() {
        return 0.5f;
    }

    @Override // qg.m
    public final int e() {
        return R.raw.photo_neon;
    }

    @Override // qg.m
    public final float g() {
        return 0.2f;
    }

    @Override // qg.m
    public final float h() {
        return 1.45f;
    }

    @Override // qg.m
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

    @Override // qg.m
    public final float k() {
        return 0.07f;
    }

    @Override // qg.m
    public final int l() {
        return R.drawable.paint_neon_brush;
    }
}
