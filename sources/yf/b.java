package yf;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b extends m {
    @Override // yf.m
    public final float a() {
        return 1.0f;
    }

    @Override // yf.m
    public final float d() {
        return 1.0f;
    }

    @Override // yf.m
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // yf.m
    public final float g() {
        return 0.35f;
    }

    @Override // yf.m
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
