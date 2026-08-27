package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class f1 extends e1 {
    public f1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // r0.j1
    public m1 a() {
        return m1.h(null, this.c.consumeDisplayCutout());
    }

    @Override // r0.j1
    public j e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // r0.d1, r0.j1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Objects.equals(this.c, f1Var.c) && Objects.equals(this.g, f1Var.g) && d1.B(this.h, f1Var.h);
    }

    @Override // r0.j1
    public int hashCode() {
        return this.c.hashCode();
    }
}
