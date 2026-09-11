package qg;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b extends m {
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
        return R.raw.photo_blur;
    }

    @Override // qg.m
    public final float g() {
        return 0.35f;
    }

    @Override // qg.m
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
