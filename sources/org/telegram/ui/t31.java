package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t31 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ u31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t31(u31 u31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.x = u31Var;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        u31 u31Var = this.x;
        ci.d dVar = u31Var.s;
        if (dVar != null) {
            dVar.setEnabled(u31Var.d.optional || !TextUtils.isEmpty(u31Var.n.getText()));
        }
    }
}
