package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ri0 extends z81 {
    public final /* synthetic */ si0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(si0 si0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = si0Var;
    }

    @Override // org.telegram.ui.z81
    public final void c() {
        int i10;
        int i11;
        int i12;
        ui0 ui0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                b91 b91Var = this.r;
                b91Var.e = new kg.e(b91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) ui0Var.v.get(str);
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
            o91 o91Var = new o91();
            ui0Var.w = o91Var;
            ui0Var.f.getClass();
            o91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) ui0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, o91Var, 25), null, null, 0, ui0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) ui0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) ui0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.z81
    public final void f() {
        si0 si0Var = this.v;
        ui0 ui0Var = si0Var.d;
        o91 o91Var = ui0Var.w;
        if (o91Var != null) {
            o91Var.b = true;
        }
        int childCount = ui0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = si0Var.d.f.getChildAt(i10);
            if (childAt instanceof z81) {
                ((z81) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.z81
    public final void b(b91 b91Var) {
    }
}
