package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class s91 extends r91 {
    public final int v;
    public final /* synthetic */ ha1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(ha1 ha1Var, Context context, int i10, int i11, wf.f fVar) {
        super(context, i11, fVar, null);
        this.w = ha1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.r91
    public final void b(t91 t91Var) {
        int i10;
        ha1 ha1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.p2) ha1Var).classGuid;
        t91Var.a(this.v, i10, ha1Var.a.stats_dc, new org.telegram.ui.Components.t51(1, ha1Var, this.r));
    }

    @Override // org.telegram.ui.r91
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        wf.g gVar = this.b;
        if (gVar.q0.D) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                t91 t91Var = this.r;
                t91Var.e = new xf.e(t91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            ha1 ha1Var = this.w;
            ha1.Z(ha1Var);
            String str = this.r.g + "_" + selectedDate;
            xf.b bVar = (xf.b) ha1Var.S.get(str);
            if (bVar != null) {
                this.r.e = bVar;
                g(false);
                return;
            }
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.r.g;
            if (selectedDate != 0) {
                tL_loadAsyncGraph.x = selectedDate;
                tL_loadAsyncGraph.flags |= 1;
            }
            ga1 ga1Var = new ga1();
            ha1Var.W = ga1Var;
            ha1Var.P.getClass();
            ga1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new tr0(this, str, ga1Var, 10), null, null, 0, ha1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.p2) ha1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.r91
    public final void f() {
        ha1.Z(this.w);
    }
}
