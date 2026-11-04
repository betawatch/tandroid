package tg;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends h {
    @Override // tg.h
    public final float a() {
        return 1.0f;
    }

    @Override // tg.h
    public final float d() {
        return 1.0f;
    }

    @Override // tg.h
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // tg.h
    public final float g() {
        return 0.35f;
    }

    @Override // tg.h
    public final String i(int i3) {
        if (i3 == 0) {
            return "blitWithMaskBlurer";
        }
        if (i3 == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i3 != 2) {
            return null;
        }
        return "brush";
    }
}
