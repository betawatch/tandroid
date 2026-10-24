package qg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // qg.m
    public final float a() {
        return 1.0f;
    }

    @Override // qg.m
    public final float d() {
        return 1.0f;
    }

    @Override // qg.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // qg.m
    public final float g() {
        return 0.35f;
    }

    @Override // qg.m
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskBlurer";
        }
        if (i10 == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }
}
