package pg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class d extends m {
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
        return R.raw.photo_eraser;
    }

    @Override // pg.m
    public final float g() {
        return 0.35f;
    }

    @Override // pg.m
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskEraser";
        }
        if (i10 == 1) {
            return "compositeWithMaskEraser";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }
}
