package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class sa1 extends ra1 {
    public final int v;
    public final /* synthetic */ hb1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa1(hb1 hb1Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.w = hb1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.ra1
    public final void b(ta1 ta1Var) {
        int i10;
        hb1 hb1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.m2) hb1Var).classGuid;
        ta1Var.a(this.v, i10, hb1Var.a.stats_dc, new bi(2, hb1Var, this.r));
    }

    @Override // org.telegram.ui.ra1
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                ta1 ta1Var = this.r;
                ta1Var.e = new kg.e(ta1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            hb1 hb1Var = this.w;
            hb1.Z(hb1Var);
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) hb1Var.V.get(str);
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
            gb1 gb1Var = new gb1();
            hb1Var.Z = gb1Var;
            hb1Var.S.getClass();
            gb1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ts0(this, str, gb1Var, 10), null, null, 0, hb1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.m2) hb1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.ra1
    public final void f() {
        hb1.Z(this.w);
    }
}
