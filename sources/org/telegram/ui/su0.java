package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class su0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ vu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(vu0 vu0Var, Context context, int i9) {
        super(context, i9, null, null);
        this.B = vu0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        xu0.c0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        xu0.d0(this.B.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        xu0 xu0Var = this.B.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        fh.s sVar = this.d;
        sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i9 = 0;
        while (!arrayList.isEmpty() && i9 < xu0Var.n) {
            for (int length = xu0Var.v.length - 1; length > i9; length--) {
                CharSequence[] charSequenceArr = xu0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            xu0Var.v[i9] = (CharSequence) arrayList.remove(0);
            xu0Var.y++;
            i9++;
        }
        xu0Var.q0();
        xu0Var.c0 = (xu0Var.j0 + i9) - 1;
        xu0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(fh.s sVar, ActionMode actionMode) {
    }
}
