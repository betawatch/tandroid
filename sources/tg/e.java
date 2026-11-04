package tg;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends h {
    @Override // tg.h
    public final float a() {
        return 0.7f;
    }

    @Override // tg.h
    public final int c() {
        return -13318311;
    }

    @Override // tg.h
    public final float d() {
        return 0.5f;
    }

    @Override // tg.h
    public final int e() {
        return R.raw.photo_neon;
    }

    @Override // tg.h
    public final float g() {
        return 0.2f;
    }

    @Override // tg.h
    public final float h() {
        return 1.45f;
    }

    @Override // tg.h
    public final String i(int i3) {
        if (i3 == 0) {
            return "blitWithMaskLight";
        }
        if (i3 == 1) {
            return "compositeWithMaskLight";
        }
        if (i3 != 2) {
            return null;
        }
        return "brushLight";
    }

    @Override // tg.h
    public final float k() {
        return 0.07f;
    }

    @Override // tg.h
    public final int l() {
        return R.drawable.paint_neon_brush;
    }
}
