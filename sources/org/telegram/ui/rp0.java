package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rp0 implements org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ aq0 a;

    public rp0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void d() {
        aq0 aq0Var = this.a;
        aq0Var.M.setText(LocaleController.getString(aq0Var.U ? R.string.ShowAsGrid : R.string.ShowAsList));
        aq0Var.M.setIcon(aq0Var.U ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void c() {
    }
}
