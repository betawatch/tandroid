package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yi0 extends r91 {
    public final /* synthetic */ zi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(zi0 zi0Var, Context context, int i10, wf.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, fVar, g6Var);
        this.v = zi0Var;
    }

    @Override // org.telegram.ui.r91
    public final void c() {
        int i10;
        int i11;
        int i12;
        bj0 bj0Var = this.v.d;
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
            f();
            String str = this.r.g + "_" + selectedDate;
            xf.b bVar = (xf.b) bj0Var.v.get(str);
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
            bj0Var.w = ga1Var;
            bj0Var.f.getClass();
            ga1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.p2) bj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, ga1Var, 25), null, null, 0, bj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.p2) bj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.p2) bj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.r91
    public final void f() {
        zi0 zi0Var = this.v;
        bj0 bj0Var = zi0Var.d;
        ga1 ga1Var = bj0Var.w;
        if (ga1Var != null) {
            ga1Var.b = true;
        }
        int childCount = bj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zi0Var.d.f.getChildAt(i10);
            if (childAt instanceof r91) {
                ((r91) childAt).b.q0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.r91
    public final void b(t91 t91Var) {
    }
}
