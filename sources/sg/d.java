package sg;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d extends h {
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
        return R.raw.photo_eraser;
    }

    @Override // sg.h
    public final float g() {
        return 0.35f;
    }

    @Override // sg.h
    public final String i(int i7) {
        if (i7 == 0) {
            return "blitWithMaskEraser";
        }
        if (i7 == 1) {
            return "compositeWithMaskEraser";
        }
        if (i7 != 2) {
            return null;
        }
        return "brush";
    }
}
