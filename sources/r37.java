// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r37 extends q59 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ sm0 d;
    public final /* synthetic */ n10 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pv7 h;

    public r37(pv7 pv7Var, Context context, sm0 sm0Var, n10 n10Var, boolean z) {
        this.h = pv7Var;
        this.c = context;
        this.d = sm0Var;
        this.e = n10Var;
        this.f = z;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return this.h.u0.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((k47) this.h.u0.get((r1.size() - 1) - i)).U;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        boolean z;
        c47 d;
        pv7 pv7Var = this.h;
        ArrayList arrayList = pv7Var.u0;
        k47 k47Var = (k47) arrayList.get((arrayList.size() - 1) - i);
        View view = u69Var.a;
        if (!(view instanceof rc2)) {
            if (view instanceof cm1) {
                ((cm1) view).setMessageObject(k47Var);
                return;
            }
            return;
        }
        rc2 rc2Var = (rc2) view;
        f47 f47Var = pv7Var.v0;
        if (f47Var == null || (d = f47Var.d(k47Var)) == null) {
            z = false;
        } else {
            z = d.c != 0;
        }
        f47 f47Var2 = pv7Var.v0;
        rc2Var.z3(k47Var, f47Var2, f47Var2 != null, z, false, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        t37 t37Var = this.h.F0;
        Context context = this.c;
        if (i == 1) {
            return new b59(new p37(this, context, t37Var));
        }
        q37 q37Var = new q37(this, context, z8c.t0, t37Var);
        q37Var.f6 = true;
        return new b59(q37Var);
    }
}
