package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.b5;
import hi.v5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s0 extends bk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ca d;
    public final /* synthetic */ v5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b5 h;

    public s0(b5 b5Var, Context context, ca caVar, v5 v5Var, boolean z10) {
        this.h = b5Var;
        this.c = context;
        this.d = caVar;
        this.e = v5Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.h.t0.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((fj) this.h.t0.get((r0.size() - 1) - i7)).U;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        xi d;
        b5 b5Var = this.h;
        ArrayList arrayList = b5Var.t0;
        fj fjVar = (fj) arrayList.get((arrayList.size() - 1) - i7);
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.u0) {
                ((org.telegram.ui.Cells.u0) view).setMessageObject(fjVar);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        aj ajVar = b5Var.u0;
        if (ajVar == null || (d = ajVar.d(fjVar)) == null) {
            z10 = false;
        } else {
            z10 = d.c != 0;
        }
        aj ajVar2 = b5Var.u0;
        q1Var.y3(fjVar, ajVar2, ajVar2 != null, z10, false, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        t0 t0Var = this.h.E0;
        Context context = this.c;
        if (i7 == 1) {
            return new kj0(new q0(this, context, t0Var));
        }
        r0 r0Var = new r0(this, context, j10.t0, t0Var);
        r0Var.f6 = true;
        return new kj0(r0Var);
    }
}
