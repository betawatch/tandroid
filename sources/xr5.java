// default package

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xr5 extends m8 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ cs5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr5(cs5 cs5Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = cs5Var;
        this.o = viewGroup;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        cs5 cs5Var = this.p;
        cs5Var.v(viewGroup);
        Runnable runnable = cs5Var.p;
        if (runnable != null) {
            runnable.run();
            cs5Var.p = null;
        }
    }
}
