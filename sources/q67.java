// default package

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q67 extends gza {
    public final /* synthetic */ r67 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q67(r67 r67Var, Context context, int i, mg0 mg0Var, ylb ylbVar) {
        super(context, i, mg0Var, ylbVar);
        this.w = r67Var;
    }

    @Override // gza
    public final void c() {
        int i;
        int i2;
        int i3;
        t67 t67Var = this.w.d;
        if (this.r.c <= 0) {
            performClick();
            ng0 ng0Var = this.b;
            if (ng0Var.u0.H) {
                long selectedDate = ng0Var.getSelectedDate();
                jza jzaVar = this.r;
                if (this.s == 4) {
                    jzaVar.e = new moa(jzaVar.d, selectedDate);
                    g(false);
                    return;
                }
                if (jzaVar.g == null) {
                    return;
                }
                f();
                String str = this.r.g + "_" + selectedDate;
                nl1 nl1Var = (nl1) t67Var.w.f(str);
                if (nl1Var != null) {
                    this.r.e = nl1Var;
                    g(false);
                    return;
                }
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                tL_loadAsyncGraph.token = this.r.g;
                if (selectedDate != 0) {
                    tL_loadAsyncGraph.x = selectedDate;
                    tL_loadAsyncGraph.flags |= 1;
                }
                wza wzaVar = new wza();
                t67Var.x = wzaVar;
                t67Var.f.getClass();
                wzaVar.a = RecyclerView.R(this);
                ng0Var.u0.d(true, false);
                i = ((d) t67Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new i65(this, str, wzaVar, (byte) 15), null, null, 0, t67Var.a.stats_dc, 1, true);
                i2 = ((d) t67Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                i3 = ((d) t67Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i3);
            }
        }
    }

    @Override // gza
    public final void f() {
        t67 t67Var = this.w.d;
        wza wzaVar = t67Var.x;
        if (wzaVar != null) {
            wzaVar.b = true;
        }
        int childCount = t67Var.f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = t67Var.f.getChildAt(i);
            if (childAt instanceof gza) {
                ((gza) childAt).b.u0.d(false, true);
            }
        }
    }
}
