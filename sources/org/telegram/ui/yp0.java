package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yp0 extends s4.r0 {
    public final /* synthetic */ kq0 a;

    public yp0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        kq0 kq0Var = this.a;
        if (kq0Var.J == null) {
            int L0 = kq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(kq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= kq0Var.M.B() - 2 || kq0Var.r || kq0Var.s) {
                return;
            }
            kq0Var.d0(kq0Var.v, kq0Var.w, kq0Var.a == 1, true);
        }
    }
}
