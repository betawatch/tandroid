package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class si0 extends b91 {
    public final /* synthetic */ ti0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(ti0 ti0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = ti0Var;
    }

    @Override // org.telegram.ui.b91
    public final void c() {
        int i10;
        int i11;
        int i12;
        vi0 vi0Var = this.v.d;
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
            kg.b bVar = (kg.b) vi0Var.v.get(str);
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
            vi0Var.w = q91Var;
            vi0Var.f.getClass();
            q91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, q91Var, 25), null, null, 0, vi0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) vi0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.b91
    public final void f() {
        ti0 ti0Var = this.v;
        vi0 vi0Var = ti0Var.d;
        q91 q91Var = vi0Var.w;
        if (q91Var != null) {
            q91Var.b = true;
        }
        int childCount = vi0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f.getChildAt(i10);
            if (childAt instanceof b91) {
                ((b91) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.b91
    public final void b(d91 d91Var) {
    }
}
