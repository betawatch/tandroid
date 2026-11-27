// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y37 extends c79 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ tl0 d;
    public final /* synthetic */ o00 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vw7 h;

    public y37(vw7 vw7Var, Context context, tl0 tl0Var, o00 o00Var, boolean z) {
        this.h = vw7Var;
        this.c = context;
        this.d = tl0Var;
        this.e = o00Var;
        this.f = z;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return this.h.u0.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((r47) this.h.u0.get((r1.size() - 1) - i)).U;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        boolean z;
        j47 d;
        vw7 vw7Var = this.h;
        ArrayList arrayList = vw7Var.u0;
        r47 r47Var = (r47) arrayList.get((arrayList.size() - 1) - i);
        View view = f89Var.a;
        if (!(view instanceof wb2)) {
            if (view instanceof dl1) {
                ((dl1) view).setMessageObject(r47Var);
                return;
            }
            return;
        }
        wb2 wb2Var = (wb2) view;
        m47 m47Var = vw7Var.v0;
        if (m47Var == null || (d = m47Var.d(r47Var)) == null) {
            z = false;
        } else {
            z = d.c != 0;
        }
        m47 m47Var2 = vw7Var.v0;
        wb2Var.z3(r47Var, m47Var2, m47Var2 != null, z, false, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        a47 a47Var = this.h.F0;
        Context context = this.c;
        if (i == 1) {
            return new n69(new w37(this, context, a47Var));
        }
        x37 x37Var = new x37(this, context, yac.t0, a47Var);
        x37Var.f6 = true;
        return new n69(x37Var);
    }
}
