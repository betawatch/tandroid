package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qi0 extends c91 {
    public final /* synthetic */ ri0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(ri0 ri0Var, Context context, int i9, qf.f fVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, fVar, b6Var);
        this.v = ri0Var;
    }

    @Override // org.telegram.ui.c91
    public final void c() {
        int i9;
        int i10;
        int i11;
        ti0 ti0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        qf.g gVar = this.b;
        if (gVar.p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                e91 e91Var = this.r;
                e91Var.e = new rf.e(e91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            rf.b bVar = (rf.b) ti0Var.v.get(str);
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
            r91 r91Var = new r91();
            ti0Var.w = r91Var;
            ti0Var.f.getClass();
            r91Var.a = RecyclerView.R(this);
            gVar.p0.d(true, false);
            i9 = ((org.telegram.ui.ActionBar.o2) ti0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i9).sendRequest(tL_loadAsyncGraph, new y9(this, str, r91Var, 25), null, null, 0, ti0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.o2) ti0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.o2) ti0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.c91
    public final void f() {
        ri0 ri0Var = this.v;
        ti0 ti0Var = ri0Var.d;
        r91 r91Var = ti0Var.w;
        if (r91Var != null) {
            r91Var.b = true;
        }
        int childCount = ti0Var.f.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = ri0Var.d.f.getChildAt(i9);
            if (childAt instanceof c91) {
                ((c91) childAt).b.p0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.c91
    public final void b(e91 e91Var) {
    }
}
