package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s21 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ u21 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(u21 u21Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, "", true, false, 1024, u6Var);
        this.E = u21Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        u21 u21Var = this.E;
        fi.d dVar = u21Var.s;
        if (dVar != null) {
            dVar.setEnabled(u21Var.d.optional || !TextUtils.isEmpty(u21Var.n.getText()));
        }
    }
}
