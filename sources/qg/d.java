package qg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class d extends m {
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
        return R.raw.photo_eraser;
    }

    @Override // qg.m
    public final float g() {
        return 0.35f;
    }

    @Override // qg.m
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
