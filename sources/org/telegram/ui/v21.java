package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v21 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ x21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(x21 x21Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.x = x21Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        x21 x21Var = this.x;
        nh.d dVar = x21Var.s;
        if (dVar != null) {
            dVar.setEnabled(x21Var.d.optional || !TextUtils.isEmpty(x21Var.n.getText()));
        }
    }
}
