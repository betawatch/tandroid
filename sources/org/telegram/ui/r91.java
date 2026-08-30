package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class r91 extends q91 {
    public final int v;
    public final /* synthetic */ ga1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r91(ga1 ga1Var, Context context, int i10, int i11, vf.f fVar) {
        super(context, i11, fVar, null);
        this.w = ga1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.q91
    public final void b(s91 s91Var) {
        int i10;
        ga1 ga1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.p2) ga1Var).classGuid;
        s91Var.a(this.v, i10, ga1Var.a.stats_dc, new org.telegram.ui.Components.s51(1, ga1Var, this.r));
    }

    @Override // org.telegram.ui.q91
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        vf.g gVar = this.b;
        if (gVar.q0.D) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                s91 s91Var = this.r;
                s91Var.e = new wf.e(s91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            ga1 ga1Var = this.w;
            ga1.Z(ga1Var);
            String str = this.r.g + "_" + selectedDate;
            wf.b bVar = (wf.b) ga1Var.S.get(str);
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
            fa1 fa1Var = new fa1();
            ga1Var.W = fa1Var;
            ga1Var.P.getClass();
            fa1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new rr0(this, str, fa1Var, 10), null, null, 0, ga1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.p2) ga1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.q91
    public final void f() {
        ga1.Z(this.w);
    }
}
