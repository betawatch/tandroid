package pg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // pg.m
    public final float a() {
        return 1.0f;
    }

    @Override // pg.m
    public final float d() {
        return 1.0f;
    }

    @Override // pg.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // pg.m
    public final float g() {
        return 0.35f;
    }

    @Override // pg.m
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
