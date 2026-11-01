package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yz0 extends org.telegram.ui.Cells.m3 {
    public final /* synthetic */ a01 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0(a01 a01Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, "", true, false, 1024, p6Var);
        this.E = a01Var;
    }

    @Override // org.telegram.ui.Cells.m3
    public final void b(Editable editable) {
        a01 a01Var = this.E;
        vh.d dVar = a01Var.s;
        if (dVar != null) {
            dVar.setEnabled(a01Var.d.optional || !TextUtils.isEmpty(a01Var.n.getText()));
        }
    }
}
