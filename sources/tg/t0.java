package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.a5;
import hi.u5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class t0 extends dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ca d;
    public final /* synthetic */ u5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a5 h;

    public t0(a5 a5Var, Context context, ca caVar, u5 u5Var, boolean z10) {
        this.h = a5Var;
        this.c = context;
        this.d = caVar;
        this.e = u5Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.dk0
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
        a5 a5Var = this.h;
        ArrayList arrayList = a5Var.t0;
        fj fjVar = (fj) arrayList.get((arrayList.size() - 1) - i7);
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.r1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(fjVar);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
        aj ajVar = a5Var.u0;
        if (ajVar == null || (d = ajVar.d(fjVar)) == null) {
            z10 = false;
        } else {
            z10 = d.c != 0;
        }
        aj ajVar2 = a5Var.u0;
        r1Var.y3(fjVar, ajVar2, ajVar2 != null, z10, false, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        u0 u0Var = this.h.E0;
        Context context = this.c;
        if (i7 == 1) {
            return new mj0(new r0(this, context, u0Var));
        }
        s0 s0Var = new s0(this, context, j10.t0, u0Var);
        s0Var.f6 = true;
        return new mj0(s0Var);
    }
}
