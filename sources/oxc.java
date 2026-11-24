// default package

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class oxc extends nxc {
    public oxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
    }

    @Override // sxc
    public vxc a() {
        return vxc.h(null, this.c.consumeDisplayCutout());
    }

    @Override // sxc
    public lo3 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new lo3(displayCutout);
    }

    @Override // mxc, sxc
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxc)) {
            return false;
        }
        oxc oxcVar = (oxc) obj;
        return Objects.equals(this.c, oxcVar.c) && Objects.equals(this.g, oxcVar.g) && mxc.B(this.h, oxcVar.h);
    }

    @Override // sxc
    public int hashCode() {
        return this.c.hashCode();
    }
}
