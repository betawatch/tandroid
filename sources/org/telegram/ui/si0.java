package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class si0 extends g91 {
    public final /* synthetic */ ti0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(ti0 ti0Var, Context context, int i10, kg.g gVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, gVar, u6Var);
        this.v = ti0Var;
    }

    @Override // org.telegram.ui.g91
    public final void c() {
        int i10;
        int i11;
        int i12;
        vi0 vi0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        kg.h hVar = this.b;
        if (hVar.t0.G) {
            long selectedDate = hVar.getSelectedDate();
            if (this.s == 4) {
                i91 i91Var = this.r;
                i91Var.e = new lg.e(i91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            lg.b bVar = (lg.b) vi0Var.v.get(str);
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
            v91 v91Var = new v91();
            vi0Var.w = v91Var;
            vi0Var.f.getClass();
            v91Var.a = RecyclerView.R(this);
            hVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.r2) vi0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, v91Var, 25), null, null, 0, vi0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.r2) vi0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.r2) vi0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.g91
    public final void f() {
        ti0 ti0Var = this.v;
        vi0 vi0Var = ti0Var.d;
        v91 v91Var = vi0Var.w;
        if (v91Var != null) {
            v91Var.b = true;
        }
        int childCount = vi0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f.getChildAt(i10);
            if (childAt instanceof g91) {
                ((g91) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.g91
    public final void b(i91 i91Var) {
    }
}
