package sg;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
