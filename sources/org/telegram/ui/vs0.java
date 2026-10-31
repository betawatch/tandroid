package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ ys0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ys0 ys0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = ys0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        at0.h0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        at0.i0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        at0 at0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        ih.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < at0Var.n) {
            for (int length = at0Var.w.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = at0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            at0Var.w[i10] = (CharSequence) arrayList.remove(0);
            at0Var.D++;
            i10++;
        }
        at0Var.v0();
        at0Var.g0 = (at0Var.n0 + i10) - 1;
        at0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
    }
}
