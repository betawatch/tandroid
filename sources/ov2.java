// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ov2 extends m8 {
    public final /* synthetic */ tv2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov2(tv2 tv2Var, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = tv2Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xv2 xv2Var = this.o.a;
        xv2Var.k = null;
        xv2Var.K = false;
        if (xv2Var.R) {
            xv2Var.b();
        }
    }
}
