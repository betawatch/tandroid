package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xi0 extends q91 {
    public final /* synthetic */ yi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(yi0 yi0Var, Context context, int i10, vf.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = yi0Var;
    }

    @Override // org.telegram.ui.q91
    public final void c() {
        int i10;
        int i11;
        int i12;
        aj0 aj0Var = this.v.d;
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
            f();
            String str = this.r.g + "_" + selectedDate;
            wf.b bVar = (wf.b) aj0Var.v.get(str);
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
            aj0Var.w = fa1Var;
            aj0Var.f.getClass();
            fa1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.p2) aj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, fa1Var, 25), null, null, 0, aj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.p2) aj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.p2) aj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.q91
    public final void f() {
        yi0 yi0Var = this.v;
        aj0 aj0Var = yi0Var.d;
        fa1 fa1Var = aj0Var.w;
        if (fa1Var != null) {
            fa1Var.b = true;
        }
        int childCount = aj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yi0Var.d.f.getChildAt(i10);
            if (childAt instanceof q91) {
                ((q91) childAt).b.q0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.q91
    public final void b(s91 s91Var) {
    }
}
