package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class d1 extends c1 {
    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // r0.i1
    public l1 a() {
        return l1.h(null, this.c.consumeDisplayCutout());
    }

    @Override // r0.i1
    public h e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // r0.b1, r0.i1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Objects.equals(this.c, d1Var.c) && Objects.equals(this.g, d1Var.g) && b1.B(this.h, d1Var.h);
    }

    @Override // r0.i1
    public int hashCode() {
        return this.c.hashCode();
    }
}
