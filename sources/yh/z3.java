package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final v01 b;
    public final v01 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new v01(str, 12.0f, null);
        this.c = new v01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
