// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q11 extends u11 {
    @Override // u11
    public final float a() {
        return 1.0f;
    }

    @Override // u11
    public final float c() {
        return 1.0f;
    }

    @Override // u11
    public final int d() {
        return R.raw.photo_eraser;
    }

    @Override // u11
    public final float f() {
        return 0.35f;
    }

    @Override // u11
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
