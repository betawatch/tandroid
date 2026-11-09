package sg;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b extends h {
    @Override // sg.h
    public final float a() {
        return 1.0f;
    }

    @Override // sg.h
    public final float d() {
        return 1.0f;
    }

    @Override // sg.h
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override // sg.h
    public final float g() {
        return 0.35f;
    }

    @Override // sg.h
    public final String i(int i7) {
        if (i7 == 0) {
            return "blitWithMaskBlurer";
        }
        if (i7 == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i7 != 2) {
            return null;
        }
        return "brush";
    }
}
