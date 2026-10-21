package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zp0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ jq0 a;

    public zp0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void f() {
        jq0 jq0Var = this.a;
        jq0Var.Q.setText(LocaleController.getString(jq0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        jq0Var.Q.setIcon(jq0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void e() {
    }
}
