package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class y91 extends x91 {
    public final int v;
    public final /* synthetic */ na1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(na1 na1Var, Context context, int i10, int i11, wf.f fVar) {
        super(context, i11, fVar, null);
        this.w = na1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.x91
    public final void b(z91 z91Var) {
        int i10;
        na1 na1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.p2) na1Var).classGuid;
        z91Var.a(this.v, i10, na1Var.a.stats_dc, new org.telegram.ui.Components.s51(1, na1Var, this.r));
    }

    @Override // org.telegram.ui.x91
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
                z91 z91Var = this.r;
                z91Var.e = new xf.e(z91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            na1 na1Var = this.w;
            na1.Z(na1Var);
            String str = this.r.g + "_" + selectedDate;
            xf.b bVar = (xf.b) na1Var.S.get(str);
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
            ma1 ma1Var = new ma1();
            na1Var.W = ma1Var;
            na1Var.P.getClass();
            ma1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new yr0(this, str, ma1Var, 10), null, null, 0, na1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.p2) na1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.x91
    public final void f() {
        na1.Z(this.w);
    }
}
