// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
