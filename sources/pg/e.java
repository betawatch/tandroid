package pg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class e extends m {
    @Override // pg.m
    public final float a() {
        return 0.7f;
    }

    @Override // pg.m
    public final int c() {
        return -13318311;
    }

    @Override // pg.m
    public final float d() {
        return 0.5f;
    }

    @Override // pg.m
    public final int e() {
        return R.raw.photo_neon;
    }

    @Override // pg.m
    public final float g() {
        return 0.2f;
    }

    @Override // pg.m
    public final float h() {
        return 1.45f;
    }

    @Override // pg.m
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

    @Override // pg.m
    public final float k() {
        return 0.07f;
    }

    @Override // pg.m
    public final int l() {
        return R.drawable.paint_neon_brush;
    }
}
