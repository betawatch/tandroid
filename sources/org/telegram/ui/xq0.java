package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xq0 implements org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ hr0 a;

    public xq0(hr0 hr0Var) {
        this.a = hr0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void e() {
        hr0 hr0Var = this.a;
        hr0Var.Q.setText(LocaleController.getString(hr0Var.Y ? R.string.ShowAsGrid : R.string.ShowAsList));
        hr0Var.Q.setIcon(hr0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void d() {
    }
}
