package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class vi0 extends e91 {
    public final /* synthetic */ wi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(wi0 wi0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, fVar, g6Var);
        this.v = wi0Var;
    }

    @Override // org.telegram.ui.e91
    public final void c() {
        int i10;
        int i11;
        int i12;
        yi0 yi0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                g91 g91Var = this.r;
                g91Var.e = new kg.e(g91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) yi0Var.v.get(str);
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
            t91 t91Var = new t91();
            yi0Var.w = t91Var;
            yi0Var.f.getClass();
            t91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.o2) yi0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, t91Var, 25), null, null, 0, yi0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.o2) yi0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.o2) yi0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.e91
    public final void f() {
        wi0 wi0Var = this.v;
        yi0 yi0Var = wi0Var.d;
        t91 t91Var = yi0Var.w;
        if (t91Var != null) {
            t91Var.b = true;
        }
        int childCount = yi0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wi0Var.d.f.getChildAt(i10);
            if (childAt instanceof e91) {
                ((e91) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.e91
    public final void b(g91 g91Var) {
    }
}
