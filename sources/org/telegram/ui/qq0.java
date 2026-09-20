package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
