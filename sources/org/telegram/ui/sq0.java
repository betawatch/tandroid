package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
