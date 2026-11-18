package sg;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
