package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gi.c5;
import gi.x5;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 extends sj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ x9 d;
    public final /* synthetic */ x5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c5 h;

    public r0(c5 c5Var, Context context, x9 x9Var, x5 x5Var, boolean z10) {
        this.h = c5Var;
        this.c = context;
        this.d = x9Var;
        this.e = x5Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.h.t0.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((zi) this.h.t0.get((r0.size() - 1) - i3)).U;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        ri d;
        c5 c5Var = this.h;
        ArrayList arrayList = c5Var.t0;
        zi ziVar = (zi) arrayList.get((arrayList.size() - 1) - i3);
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).setMessageObject(ziVar);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        ui uiVar = c5Var.u0;
        if (uiVar == null || (d = uiVar.d(ziVar)) == null) {
            z10 = false;
        } else {
            z10 = d.c != 0;
        }
        ui uiVar2 = c5Var.u0;
        q1Var.u3(ziVar, uiVar2, uiVar2 != null, z10, false, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        s0 s0Var = this.h.E0;
        Context context = this.c;
        if (i3 == 1) {
            return new bj0(new p0(this, context, s0Var));
        }
        q0 q0Var = new q0(this, context, h10.t0, s0Var);
        q0Var.e6 = true;
        return new bj0(q0Var);
    }
}
