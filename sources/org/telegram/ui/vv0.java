package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vv0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ yv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(yv0 yv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = yv0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        aw0.e0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < aw0Var.n) {
            for (int length = aw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = aw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            aw0Var.y++;
            i10++;
        }
        aw0Var.r0();
        aw0Var.g0 = (aw0Var.n0 + i10) - 1;
        aw0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
    }
}
