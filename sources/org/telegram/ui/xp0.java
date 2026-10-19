package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xp0 extends s4.r0 {
    public final /* synthetic */ jq0 a;

    public xp0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jq0 jq0Var = this.a;
        if (jq0Var.J == null) {
            int L0 = jq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(jq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= jq0Var.M.B() - 2 || jq0Var.r || jq0Var.s) {
                return;
            }
            jq0Var.d0(jq0Var.v, jq0Var.w, jq0Var.a == 1, true);
        }
    }
}
