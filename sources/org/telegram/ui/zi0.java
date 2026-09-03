package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zi0 extends y91 {
    public final /* synthetic */ aj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(aj0 aj0Var, Context context, int i10, vf.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = aj0Var;
    }

    @Override // org.telegram.ui.y91
    public final void c() {
        int i10;
        int i11;
        int i12;
        cj0 cj0Var = this.v.d;
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
            f();
            String str = this.r.g + "_" + selectedDate;
            wf.b bVar = (wf.b) cj0Var.v.get(str);
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
            cj0Var.w = na1Var;
            cj0Var.f.getClass();
            na1Var.a = RecyclerView.R(this);
            gVar.q0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.p2) cj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new da(this, str, na1Var, 25), null, null, 0, cj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.p2) cj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.p2) cj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.y91
    public final void f() {
        aj0 aj0Var = this.v;
        cj0 cj0Var = aj0Var.d;
        na1 na1Var = cj0Var.w;
        if (na1Var != null) {
            na1Var.b = true;
        }
        int childCount = cj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = aj0Var.d.f.getChildAt(i10);
            if (childAt instanceof y91) {
                ((y91) childAt).b.q0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.y91
    public final void b(aa1 aa1Var) {
    }
}
