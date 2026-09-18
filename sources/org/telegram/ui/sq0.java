package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sq0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ cr0 a;

    public sq0(cr0 cr0Var) {
        this.a = cr0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void e() {
        cr0 cr0Var = this.a;
        cr0Var.Q.setText(LocaleController.getString(cr0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        cr0Var.Q.setIcon(cr0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void c() {
    }
}
