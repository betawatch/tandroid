package rg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // rg.m
    public final float a() {
        return 1.0f;
    }

    @Override // rg.m
    public final float d() {
        return 1.0f;
    }

    @Override // rg.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // rg.m
    public final float g() {
        return 0.35f;
    }

    @Override // rg.m
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
