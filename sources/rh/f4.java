package rh;

import org.telegram.ui.Components.rz0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f4 {
    public final float a;
    public final rz0 b;
    public final rz0 c;

    public f4(float f7, String str, CharSequence charSequence) {
        this.b = new rz0(str, 12.0f, null);
        this.c = new rz0(charSequence, 12.0f, org.telegram.messenger.i0.o());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
