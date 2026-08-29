package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qp0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ zp0 a;

    public qp0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void e() {
        zp0 zp0Var = this.a;
        zp0Var.M.setText(LocaleController.getString(zp0Var.U ? R.string.ShowAsGrid : R.string.ShowAsList));
        zp0Var.M.setIcon(zp0Var.U ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void b() {
    }
}
