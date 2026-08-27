package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class si0 extends a91 {
    public final /* synthetic */ ti0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(ti0 ti0Var, Context context, int i10, rf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = ti0Var;
    }

    @Override // org.telegram.ui.a91
    public final void c() {
        int i10;
        int i11;
        int i12;
        vi0 vi0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        rf.g gVar = this.b;
        if (gVar.p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                c91 c91Var = this.r;
                c91Var.e = new sf.e(c91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            sf.b bVar = (sf.b) vi0Var.v.get(str);
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
            p91 p91Var = new p91();
            vi0Var.w = p91Var;
            vi0Var.f.getClass();
            p91Var.a = RecyclerView.R(this);
            gVar.p0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new z9(this, str, p91Var, 25), null, null, 0, vi0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) vi0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) vi0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.a91
    public final void f() {
        ti0 ti0Var = this.v;
        vi0 vi0Var = ti0Var.d;
        p91 p91Var = vi0Var.w;
        if (p91Var != null) {
            p91Var.b = true;
        }
        int childCount = vi0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ti0Var.d.f.getChildAt(i10);
            if (childAt instanceof a91) {
                ((a91) childAt).b.p0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.a91
    public final void b(c91 c91Var) {
    }
}
