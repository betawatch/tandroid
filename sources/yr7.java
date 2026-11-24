// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yr7 extends w39 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ as7 d;

    public yr7(as7 as7Var, Context context) {
        this.d = as7Var;
        this.c = context;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        zr7 zr7Var = (zr7) s49Var.a;
        ViewGroup.LayoutParams layoutParams = zr7Var.getLayoutParams();
        as7 as7Var = this.d;
        layoutParams.height = ((as7Var.getHeight() - as7Var.getPaddingTop()) - as7Var.getPaddingBottom()) / 2;
        k38 k38Var = as7Var.i3;
        if (k38Var != null) {
            zr7Var.a = k38Var.b(i);
            zr7Var.invalidate();
            zr7Var.b = as7Var.h3 == i ? 1.0f : 0.0f;
            zr7Var.invalidate();
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(new zr7(this.d, this.c));
    }
}
