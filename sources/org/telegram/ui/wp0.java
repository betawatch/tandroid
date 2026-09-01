package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wp0 extends f2.a1 {
    public final /* synthetic */ hq0 a;

    public wp0(hq0 hq0Var) {
        this.a = hq0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hq0 hq0Var = this.a;
        if (hq0Var.G == null) {
            int L0 = hq0Var.J.L0();
            int abs = L0 == -1 ? 0 : Math.abs(hq0Var.J.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= hq0Var.J.B() - 2 || hq0Var.r || hq0Var.s) {
                return;
            }
            hq0Var.d0(hq0Var.v, hq0Var.w, hq0Var.a == 1, true);
        }
    }
}
