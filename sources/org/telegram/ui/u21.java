package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u21 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ w21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(w21 w21Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.x = w21Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        w21 w21Var = this.x;
        lh.d dVar = w21Var.s;
        if (dVar != null) {
            dVar.setEnabled(w21Var.d.optional || !TextUtils.isEmpty(w21Var.n.getText()));
        }
    }
}
