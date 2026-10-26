package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s20 extends s4.u0 {
    public final /* synthetic */ v50 a;

    public s20(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.vl0 vl0Var;
        v50 v50Var = this.a;
        b50 b50Var = v50Var.Q;
        if (i10 != 0) {
            org.telegram.ui.Components.t40 t40Var = v50Var.m0;
            if (t40Var != null) {
                t40Var.b(true);
            }
            org.telegram.ui.Components.t40 t40Var2 = v50Var.n0;
            if (t40Var2 != null) {
                t40Var2.b(true);
                return;
            }
            return;
        }
        float dp = v50Var.y0 - AndroidUtilities.dp(74.0f);
        b50Var.getChildAt(0);
        i11 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
        if (dp + i11 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !b50Var.canScrollVertically(1) || (vl0Var = (org.telegram.ui.Components.vl0) b50Var.K(0)) == null) {
            return;
        }
        View view = vl0Var.a;
        if (view.getTop() > 0) {
            b50Var.w0(0, view.getTop(), null);
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        v50 v50Var = this.a;
        if (v50Var.Q.getChildCount() <= 0 || (call = v50Var.a1) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && v50Var.Y.N0() > v50Var.P.F - 5) {
            v50Var.a1.loadMembers(false);
        }
        v50.J0(v50Var);
        k50 k50Var = v50Var.U0;
        if (k50Var != null) {
            k50Var.invalidate();
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
    }
}
