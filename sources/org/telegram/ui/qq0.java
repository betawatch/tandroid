package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qq0 extends s4.s0 {
    public final /* synthetic */ cr0 a;

    public qq0(cr0 cr0Var) {
        this.a = cr0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cr0 cr0Var = this.a;
        if (cr0Var.J == null) {
            int L0 = cr0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(cr0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= cr0Var.M.B() - 2 || cr0Var.r || cr0Var.s) {
                return;
            }
            cr0Var.d0(cr0Var.v, cr0Var.w, cr0Var.a == 1, true);
        }
    }
}
