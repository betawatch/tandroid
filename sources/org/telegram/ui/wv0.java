package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wv0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ zv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(zv0 zv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = zv0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        bw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        bw0.e0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        bw0 bw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < bw0Var.n) {
            for (int length = bw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = bw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            bw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            bw0Var.y++;
            i10++;
        }
        bw0Var.r0();
        bw0Var.g0 = (bw0Var.n0 + i10) - 1;
        bw0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
    }
}
