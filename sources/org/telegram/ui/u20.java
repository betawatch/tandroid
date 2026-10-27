package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u20 extends s4.u0 {
    public final /* synthetic */ x50 a;

    public u20(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.wl0 wl0Var;
        x50 x50Var = this.a;
        d50 d50Var = x50Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.t40 t40Var = x50Var.m0;
            if (t40Var != null) {
                t40Var.b(true);
            }
            org.telegram.ui.Components.t40 t40Var2 = x50Var.n0;
            if (t40Var2 != null) {
                t40Var2.b(true);
                return;
            }
            return;
        }
        float dp = x50Var.y0 - AndroidUtilities.dp(74.0f);
        d50Var.getChildAt(0);
        i11 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !d50Var.canScrollVertically(1) || (wl0Var = (org.telegram.ui.Components.wl0) d50Var.K(0)) == null) {
            return;
        }
        View view = wl0Var.a;
        if (view.getTop() > 0) {
            d50Var.w0(0, view.getTop(), null);
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        x50 x50Var = this.a;
        if (x50Var.Q.getChildCount() <= 0 || (call = x50Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && x50Var.Y.N0() > x50Var.P.F - 5) {
            x50Var.a1.loadMembers(false);
        }
        x50.J0(x50Var);
        m50 m50Var = x50Var.U0;
        if (m50Var != null) {
            m50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
    }
}
