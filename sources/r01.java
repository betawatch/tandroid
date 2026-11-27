// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r01 extends v01 {
    @Override // v01
    public final float a() {
        return 1.0f;
    }

    @Override // v01
    public final float c() {
        return 1.0f;
    }

    @Override // v01
    public final int d() {
        return R.raw.photo_eraser;
    }

    @Override // v01
    public final float f() {
        return 0.35f;
    }

    @Override // v01
    public final String h(int i) {
        if (i == 0) {
            return "blitWithMaskEraser";
        }
        if (i == 1) {
            return "compositeWithMaskEraser";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }
}
