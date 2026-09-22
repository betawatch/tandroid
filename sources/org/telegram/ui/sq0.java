package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
