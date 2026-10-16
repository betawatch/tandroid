package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vq0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ fr0 a;

    public vq0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void e() {
        fr0 fr0Var = this.a;
        fr0Var.Q.setText(LocaleController.getString(fr0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        fr0Var.Q.setIcon(fr0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void d() {
    }
}
