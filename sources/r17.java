// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r17 extends n39 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ sl0 d;
    public final /* synthetic */ n00 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ot7 h;

    public r17(ot7 ot7Var, Context context, sl0 sl0Var, n00 n00Var, boolean z) {
        this.h = ot7Var;
        this.c = context;
        this.d = sl0Var;
        this.e = n00Var;
        this.f = z;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        return this.h.u0.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((k27) this.h.u0.get((r1.size() - 1) - i)).U;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        boolean z;
        c27 d;
        ot7 ot7Var = this.h;
        ArrayList arrayList = ot7Var.u0;
        k27 k27Var = (k27) arrayList.get((arrayList.size() - 1) - i);
        View view = s49Var.a;
        if (!(view instanceof gb2)) {
            if (view instanceof uk1) {
                ((uk1) view).setMessageObject(k27Var);
                return;
            }
            return;
        }
        gb2 gb2Var = (gb2) view;
        f27 f27Var = ot7Var.v0;
        if (f27Var == null || (d = f27Var.d(k27Var)) == null) {
            z = false;
        } else {
            z = d.c != 0;
        }
        f27 f27Var2 = ot7Var.v0;
        gb2Var.z3(k27Var, f27Var2, f27Var2 != null, z, false, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        t17 t17Var = this.h.F0;
        Context context = this.c;
        if (i == 1) {
            return new y29(new p17(this, context, t17Var));
        }
        q17 q17Var = new q17(this, context, y6c.t0, t17Var);
        q17Var.f6 = true;
        return new y29(q17Var);
    }
}
