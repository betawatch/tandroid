package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zz0 extends org.telegram.ui.Cells.m3 {
    public final /* synthetic */ b01 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(b01 b01Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, "", true, false, 1024, p6Var);
        this.E = b01Var;
    }

    @Override // org.telegram.ui.Cells.m3
    public final void b(Editable editable) {
        b01 b01Var = this.E;
        vh.d dVar = b01Var.s;
        if (dVar != null) {
            dVar.setEnabled(b01Var.d.optional || !TextUtils.isEmpty(b01Var.n.getText()));
        }
    }
}
