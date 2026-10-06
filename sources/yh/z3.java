package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final f11 b;
    public final f11 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new f11(str, 12.0f, null);
        this.c = new f11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
