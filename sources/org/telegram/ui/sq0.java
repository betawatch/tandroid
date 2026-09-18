package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class sq0 implements org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ cr0 a;

    public sq0(cr0 cr0Var) {
        this.a = cr0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void e() {
        cr0 cr0Var = this.a;
        cr0Var.Q.setText(LocaleController.getString(cr0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        cr0Var.Q.setIcon(cr0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void c() {
    }
}
