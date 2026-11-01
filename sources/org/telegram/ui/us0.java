package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ xs0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(xs0 xs0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xs0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        zs0.i0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zs0.j0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        zs0 zs0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        ih.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < zs0Var.n) {
            for (int length = zs0Var.w.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = zs0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            zs0Var.w[i10] = (CharSequence) arrayList.remove(0);
            zs0Var.D++;
            i10++;
        }
        zs0Var.w0();
        zs0Var.g0 = (zs0Var.n0 + i10) - 1;
        zs0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
    }
}
