// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class pxc extends oxc {
    public io5 o;
    public io5 p;
    public io5 q;

    public pxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // sxc
    public io5 h() {
        io5 io5Var = this.p;
        if (io5Var != null) {
            return io5Var;
        }
        io5 c = io5.c(this.c.getMandatorySystemGestureInsets());
        this.p = c;
        return c;
    }

    @Override // sxc
    public io5 j() {
        io5 io5Var = this.o;
        if (io5Var != null) {
            return io5Var;
        }
        io5 c = io5.c(this.c.getSystemGestureInsets());
        this.o = c;
        return c;
    }

    @Override // sxc
    public io5 l() {
        io5 io5Var = this.q;
        if (io5Var != null) {
            return io5Var;
        }
        io5 c = io5.c(this.c.getTappableElementInsets());
        this.q = c;
        return c;
    }

    @Override // mxc, sxc
    public vxc m(int i, int i2, int i3, int i4) {
        return vxc.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // nxc, sxc
    public void s(io5 io5Var) {
    }
}
