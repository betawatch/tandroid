package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s31 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ t31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(t31 t31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.x = t31Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        t31 t31Var = this.x;
        ci.d dVar = t31Var.s;
        if (dVar != null) {
            dVar.setEnabled(t31Var.d.optional || !TextUtils.isEmpty(t31Var.n.getText()));
        }
    }
}
