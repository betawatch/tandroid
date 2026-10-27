package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u21 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ w21 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(w21 w21Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, "", true, false, 1024, u6Var);
        this.E = w21Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        w21 w21Var = this.E;
        fi.d dVar = w21Var.s;
        if (dVar != null) {
            dVar.setEnabled(w21Var.d.optional || !TextUtils.isEmpty(w21Var.n.getText()));
        }
    }
}
