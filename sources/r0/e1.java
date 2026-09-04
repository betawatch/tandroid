package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // r0.i1
    public l1 a() {
        return l1.h(null, this.c.consumeDisplayCutout());
    }

    @Override // r0.i1
    public i e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // r0.c1, r0.i1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Objects.equals(this.c, e1Var.c) && Objects.equals(this.g, e1Var.g) && c1.B(this.h, e1Var.h);
    }

    @Override // r0.i1
    public int hashCode() {
        return this.c.hashCode();
    }
}
