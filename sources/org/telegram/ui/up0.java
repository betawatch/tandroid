package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class up0 extends f2.z0 {
    public final /* synthetic */ fq0 a;

    public up0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fq0 fq0Var = this.a;
        if (fq0Var.G == null) {
            int L0 = fq0Var.J.L0();
            int abs = L0 == -1 ? 0 : Math.abs(fq0Var.J.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= fq0Var.J.B() - 2 || fq0Var.r || fq0Var.s) {
                return;
            }
            fq0Var.d0(fq0Var.v, fq0Var.w, fq0Var.a == 1, true);
        }
    }
}
