package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class uv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ xv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(xv0 xv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        zv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        zv0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        zv0 zv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < zv0Var.n) {
            for (int length = zv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = zv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            zv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            zv0Var.y++;
            i10++;
        }
        zv0Var.r0();
        zv0Var.g0 = (zv0Var.n0 + i10) - 1;
        zv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}
