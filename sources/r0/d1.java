package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class d1 extends c1 {
    public d1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override // r0.h1
    public k1 a() {
        return k1.h(null, this.c.consumeDisplayCutout());
    }

    @Override // r0.h1
    public i e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // r0.b1, r0.h1
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

    @Override // r0.h1
    public int hashCode() {
        return this.c.hashCode();
    }
}
