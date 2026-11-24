// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y61 implements c39 {
    public final /* synthetic */ o39 a;
    public final /* synthetic */ z61 b;

    public y61(z61 z61Var, o39 o39Var) {
        this.b = z61Var;
        this.a = o39Var;
    }

    @Override // c39
    public final void d(int i, View view) {
        o71 o71Var = this.b.f;
        o39 o39Var = this.a;
        a71 a71Var = (a71) o39Var.getAdapter();
        h71 h71Var = (h71) a71Var.e.get(i);
        if (view instanceof qfa) {
            int i2 = o71.H;
            o71Var.c(h71Var, (j71) a71Var, o39Var);
        } else {
            d71 d71Var = o71Var.G;
            if (d71Var != null) {
                d71Var.i(h71Var.c, h71Var.d, false);
            }
        }
    }
}
