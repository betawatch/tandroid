package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class z91 extends y91 {
    public final int v;
    public final /* synthetic */ oa1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z91(oa1 oa1Var, Context context, int i10, int i11, vf.f fVar) {
        super(context, i11, fVar, null);
        this.w = oa1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.y91
    public final void b(aa1 aa1Var) {
        int i10;
        oa1 oa1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.p2) oa1Var).classGuid;
        aa1Var.a(this.v, i10, oa1Var.a.stats_dc, new org.telegram.ui.Components.s51(1, oa1Var, this.r));
    }

    @Override // org.telegram.ui.y91
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
                aa1 aa1Var = this.r;
                aa1Var.e = new wf.e(aa1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            oa1 oa1Var = this.w;
            oa1.Z(oa1Var);
            String str = this.r.g + "_" + selectedDate;
            wf.b bVar = (wf.b) oa1Var.S.get(str);
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
            na1 na1Var = new na1();
            oa1Var.W = na1Var;
            oa1Var.P.getClass();
            na1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new yr0(this, str, na1Var, 10), null, null, 0, oa1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.p2) oa1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.y91
    public final void f() {
        oa1.Z(this.w);
    }
}
