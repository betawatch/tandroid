package rg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d extends m {
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
        return R.raw.photo_eraser;
    }

    @Override // rg.m
    public final float g() {
        return 0.35f;
    }

    @Override // rg.m
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
