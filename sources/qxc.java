// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class qxc extends pxc {
    public static final vxc r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = vxc.h(null, windowInsets);
    }

    public qxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
    }

    @Override // mxc, sxc
    public io5 f(int i) {
        return io5.c(this.c.getInsets(txc.a(i)));
    }

    @Override // mxc, sxc
    public io5 g(int i) {
        return io5.c(this.c.getInsetsIgnoringVisibility(txc.a(i)));
    }

    @Override // mxc, sxc
    public boolean p(int i) {
        return this.c.isVisible(txc.a(i));
    }

    @Override // mxc, sxc
    public final void d(View view) {
    }
}
