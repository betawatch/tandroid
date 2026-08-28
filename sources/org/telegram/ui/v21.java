package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v21 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ x21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(x21 x21Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, "", true, false, 1024, b6Var);
        this.x = x21Var;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        x21 x21Var = this.x;
        kh.d dVar = x21Var.s;
        if (dVar != null) {
            dVar.setEnabled(x21Var.d.optional || !TextUtils.isEmpty(x21Var.n.getText()));
        }
    }
}
