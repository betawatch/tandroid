package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ wu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(wu0 wu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = wu0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        yu0.d0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        yu0.e0(this.B.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        yu0 yu0Var = this.B.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        gh.r rVar = this.d;
        rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < yu0Var.n) {
            for (int length = yu0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = yu0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            yu0Var.v[i10] = (CharSequence) arrayList.remove(0);
            yu0Var.y++;
            i10++;
        }
        yu0Var.r0();
        yu0Var.c0 = (yu0Var.j0 + i10) - 1;
        yu0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(gh.r rVar, ActionMode actionMode) {
    }
}
