// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rxc extends qxc {
    public static final vxc s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = vxc.h(null, windowInsets);
    }

    public rxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
    }

    @Override // qxc, mxc, sxc
    public io5 f(int i) {
        return io5.c(this.c.getInsets(uxc.a(i)));
    }

    @Override // qxc, mxc, sxc
    public io5 g(int i) {
        return io5.c(this.c.getInsetsIgnoringVisibility(uxc.a(i)));
    }

    @Override // qxc, mxc, sxc
    public boolean p(int i) {
        return this.c.isVisible(uxc.a(i));
    }
}
