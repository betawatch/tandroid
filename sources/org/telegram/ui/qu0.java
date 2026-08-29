package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qu0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ tu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(tu0 tu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = tu0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z10) {
        vu0.d0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        vu0.e0(this.B.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        vu0 vu0Var = this.B.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < vu0Var.n) {
            for (int length = vu0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = vu0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            vu0Var.v[i10] = (CharSequence) arrayList.remove(0);
            vu0Var.y++;
            i10++;
        }
        vu0Var.r0();
        vu0Var.c0 = (vu0Var.j0 + i10) - 1;
        vu0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(bh.b bVar, ActionMode actionMode) {
    }
}
