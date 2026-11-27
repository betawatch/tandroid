// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class p01 extends v01 {
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
        return R.raw.photo_blur;
    }

    @Override // v01
    public final float f() {
        return 0.35f;
    }

    @Override // v01
    public final String h(int i) {
        if (i == 0) {
            return "blitWithMaskBlurer";
        }
        if (i == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }
}
