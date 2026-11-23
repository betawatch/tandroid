package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.e6;
import hi.l5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x0 extends dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ba d;
    public final /* synthetic */ e6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ l5 h;

    public x0(l5 l5Var, Context context, ba baVar, e6 e6Var, boolean z10) {
        this.h = l5Var;
        this.c = context;
        this.d = baVar;
        this.e = e6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.h.u0.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((fj) this.h.u0.get((r0.size() - 1) - i7)).U;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        xi d;
        l5 l5Var = this.h;
        ArrayList arrayList = l5Var.u0;
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
        aj ajVar = l5Var.v0;
        if (ajVar == null || (d = ajVar.d(fjVar)) == null) {
            z10 = false;
        } else {
            z10 = d.c != 0;
        }
        aj ajVar2 = l5Var.v0;
        r1Var.y3(fjVar, ajVar2, ajVar2 != null, z10, false, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        y0 y0Var = this.h.F0;
        Context context = this.c;
        if (i7 == 1) {
            return new mj0(new v0(this, context, y0Var));
        }
        w0 w0Var = new w0(this, context, i10.t0, y0Var);
        w0Var.f6 = true;
        return new mj0(w0Var);
    }
}
