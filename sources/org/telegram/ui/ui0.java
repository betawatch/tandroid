package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ui0 extends i91 {
    public final /* synthetic */ vi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(vi0 vi0Var, Context context, int i10, kg.g gVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, gVar, u6Var);
        this.v = vi0Var;
    }

    @Override // org.telegram.ui.i91
    public final void c() {
        int i10;
        int i11;
        int i12;
        xi0 xi0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        kg.h hVar = this.b;
        if (hVar.t0.G) {
            long selectedDate = hVar.getSelectedDate();
            if (this.s == 4) {
                k91 k91Var = this.r;
                k91Var.e = new lg.e(k91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            lg.b bVar = (lg.b) xi0Var.v.get(str);
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
            x91 x91Var = new x91();
            xi0Var.w = x91Var;
            xi0Var.f.getClass();
            x91Var.a = RecyclerView.R(this);
            hVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.r2) xi0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, x91Var, 25), null, null, 0, xi0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.r2) xi0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.r2) xi0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.i91
    public final void f() {
        vi0 vi0Var = this.v;
        xi0 xi0Var = vi0Var.d;
        x91 x91Var = xi0Var.w;
        if (x91Var != null) {
            x91Var.b = true;
        }
        int childCount = xi0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = vi0Var.d.f.getChildAt(i10);
            if (childAt instanceof i91) {
                ((i91) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.i91
    public final void b(k91 k91Var) {
    }
}
