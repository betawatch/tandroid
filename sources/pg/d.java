package pg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
