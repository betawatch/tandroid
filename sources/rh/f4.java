package rh;

import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f4 {
    public final float a;
    public final qz0 b;
    public final qz0 c;

    public f4(float f7, String str, CharSequence charSequence) {
        this.b = new qz0(str, 12.0f, null);
        this.c = new qz0(charSequence, 12.0f, org.telegram.messenger.i0.o());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
