package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.c5;
import hi.w5;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s0 extends tj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ u9 d;
    public final /* synthetic */ w5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c5 h;

    public s0(c5 c5Var, Context context, u9 u9Var, w5 w5Var, boolean z10) {
        this.h = c5Var;
        this.c = context;
        this.d = u9Var;
        this.e = w5Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.h.t0.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((gj) this.h.t0.get((r0.size() - 1) - i7)).U;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        yi d;
        c5 c5Var = this.h;
        ArrayList arrayList = c5Var.t0;
        gj gjVar = (gj) arrayList.get((arrayList.size() - 1) - i7);
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).setMessageObject(gjVar);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        bj bjVar = c5Var.u0;
        if (bjVar == null || (d = bjVar.d(gjVar)) == null) {
            z10 = false;
        } else {
            z10 = d.c != 0;
        }
        bj bjVar2 = c5Var.u0;
        q1Var.x3(gjVar, bjVar2, bjVar2 != null, z10, false, false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        t0 t0Var = this.h.E0;
        Context context = this.c;
        if (i7 == 1) {
            return new cj0(new q0(this, context, t0Var));
        }
        r0 r0Var = new r0(this, context, m10.t0, t0Var);
        r0Var.f6 = true;
        return new cj0(r0Var);
    }
}
