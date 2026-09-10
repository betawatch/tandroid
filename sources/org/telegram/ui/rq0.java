package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rq0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ br0 a;

    public rq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void e() {
        br0 br0Var = this.a;
        br0Var.Q.setText(LocaleController.getString(br0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        br0Var.Q.setIcon(br0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void c() {
    }
}
