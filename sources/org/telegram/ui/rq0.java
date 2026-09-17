package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class rq0 implements org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ br0 a;

    public rq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void e() {
        br0 br0Var = this.a;
        br0Var.Q.setText(LocaleController.getString(br0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        br0Var.Q.setIcon(br0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void d() {
    }
}
