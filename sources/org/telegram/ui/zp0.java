package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
