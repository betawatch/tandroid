package qg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
