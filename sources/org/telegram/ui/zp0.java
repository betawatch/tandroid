package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zp0 extends s4.r0 {
    public final /* synthetic */ lq0 a;

    public zp0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lq0 lq0Var = this.a;
        if (lq0Var.J == null) {
            int L0 = lq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(lq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= lq0Var.M.B() - 2 || lq0Var.r || lq0Var.s) {
                return;
            }
            lq0Var.d0(lq0Var.v, lq0Var.w, lq0Var.a == 1, true);
        }
    }
}
