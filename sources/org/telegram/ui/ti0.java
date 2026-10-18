package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ti0 extends b91 {
    public final /* synthetic */ ui0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(ui0 ui0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = ui0Var;
    }

    @Override // org.telegram.ui.b91
    public final void c() {
        int i10;
        int i11;
        int i12;
        wi0 wi0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                d91 d91Var = this.r;
                d91Var.e = new kg.e(d91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) wi0Var.v.get(str);
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
            q91 q91Var = new q91();
            wi0Var.w = q91Var;
            wi0Var.f.getClass();
            q91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) wi0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, q91Var, 25), null, null, 0, wi0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) wi0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) wi0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.b91
    public final void f() {
        ui0 ui0Var = this.v;
        wi0 wi0Var = ui0Var.d;
        q91 q91Var = wi0Var.w;
        if (q91Var != null) {
            q91Var.b = true;
        }
        int childCount = wi0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ui0Var.d.f.getChildAt(i10);
            if (childAt instanceof b91) {
                ((b91) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.b91
    public final void b(d91 d91Var) {
    }
}
