package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z31 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ a41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(a41 a41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.x = a41Var;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        a41 a41Var = this.x;
        ci.d dVar = a41Var.s;
        if (dVar != null) {
            dVar.setEnabled(a41Var.d.optional || !TextUtils.isEmpty(a41Var.n.getText()));
        }
    }
}
