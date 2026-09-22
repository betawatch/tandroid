package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qq0 implements org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ ar0 a;

    public qq0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void e() {
        ar0 ar0Var = this.a;
        ar0Var.Q.setText(LocaleController.getString(ar0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        ar0Var.Q.setIcon(ar0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void c() {
    }
}
