// default package

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w67 extends g1b {
    public final /* synthetic */ x67 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w67(x67 x67Var, Context context, int i, of0 of0Var, vnb vnbVar) {
        super(context, i, of0Var, vnbVar);
        this.w = x67Var;
    }

    @Override // g1b
    public final void c() {
        int i;
        int i2;
        int i3;
        z67 z67Var = this.w.d;
        if (this.r.c <= 0) {
            performClick();
            pf0 pf0Var = this.b;
            if (pf0Var.u0.H) {
                long selectedDate = pf0Var.getSelectedDate();
                i1b i1bVar = this.r;
                if (this.s == 4) {
                    i1bVar.e = new iqa(i1bVar.d, selectedDate);
                    g(false);
                    return;
                }
                if (i1bVar.g == null) {
                    return;
                }
                f();
                String str = this.r.g + "_" + selectedDate;
                ok1 ok1Var = (ok1) z67Var.w.f(str);
                if (ok1Var != null) {
                    this.r.e = ok1Var;
                    g(false);
                    return;
                }
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                tL_loadAsyncGraph.token = this.r.g;
                if (selectedDate != 0) {
                    tL_loadAsyncGraph.x = selectedDate;
                    tL_loadAsyncGraph.flags |= 1;
                }
                v1b v1bVar = new v1b();
                z67Var.x = v1bVar;
                z67Var.f.getClass();
                v1bVar.a = RecyclerView.S(this);
                pf0Var.u0.d(true, false);
                i = ((e) z67Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new m65(this, str, v1bVar, (byte) 15), null, null, 0, z67Var.a.stats_dc, 1, true);
                i2 = ((e) z67Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                i3 = ((e) z67Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i3);
            }
        }
    }

    @Override // g1b
    public final void f() {
        z67 z67Var = this.w.d;
        v1b v1bVar = z67Var.x;
        if (v1bVar != null) {
            v1bVar.b = true;
        }
        int childCount = z67Var.f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = z67Var.f.getChildAt(i);
            if (childAt instanceof g1b) {
                ((g1b) childAt).b.u0.d(false, true);
            }
        }
    }
}
