package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tq0 extends s4.r0 {
    public final /* synthetic */ fr0 a;

    public tq0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fr0 fr0Var = this.a;
        if (fr0Var.J == null) {
            int L0 = fr0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(fr0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= fr0Var.M.B() - 2 || fr0Var.r || fr0Var.s) {
                return;
            }
            fr0Var.d0(fr0Var.v, fr0Var.w, fr0Var.a == 1, true);
        }
    }
}
