package xf;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // xf.m
    public final float a() {
        return 1.0f;
    }

    @Override // xf.m
    public final float d() {
        return 1.0f;
    }

    @Override // xf.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // xf.m
    public final float g() {
        return 0.35f;
    }

    @Override // xf.m
    public final String i(int i9) {
        if (i9 == 0) {
            return "blitWithMaskBlurer";
        }
        if (i9 == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i9 != 2) {
            return null;
        }
        return "brush";
    }
}
