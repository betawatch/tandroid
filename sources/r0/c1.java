package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class c1 extends b1 {
    public c1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    @Override // r0.g1
    public j1 a() {
        return j1.h(null, this.c.consumeDisplayCutout());
    }

    @Override // r0.g1
    public h e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // r0.a1, r0.g1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Objects.equals(this.c, c1Var.c) && Objects.equals(this.g, c1Var.g) && a1.B(this.h, c1Var.h);
    }

    @Override // r0.g1
    public int hashCode() {
        return this.c.hashCode();
    }
}
