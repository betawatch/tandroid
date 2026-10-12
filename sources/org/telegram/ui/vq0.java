package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vq0 extends s4.r0 {
    public final /* synthetic */ hr0 a;

    public vq0(hr0 hr0Var) {
        this.a = hr0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hr0 hr0Var = this.a;
        if (hr0Var.J == null) {
            int L0 = hr0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(hr0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= hr0Var.M.B() - 2 || hr0Var.r || hr0Var.s) {
                return;
            }
            hr0Var.d0(hr0Var.v, hr0Var.w, hr0Var.a == 1, true);
        }
    }
}
