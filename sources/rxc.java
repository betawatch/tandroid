// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
