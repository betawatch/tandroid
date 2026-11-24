// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
