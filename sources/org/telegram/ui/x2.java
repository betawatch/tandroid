package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x2 extends org.telegram.ui.ActionBar.d3 {
    @Override // org.telegram.ui.ActionBar.d3
    public final String b() {
        org.telegram.ui.web.u0 u0Var = this.b;
        return (u0Var == null || TextUtils.isEmpty(u0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(k3 k3Var) {
        if (k3Var == null) {
            return;
        }
        i3 i3Var = k3Var.f;
        i3Var.M();
        this.b = i3Var.getWebView();
        this.d = i3Var.getProxy();
        org.telegram.ui.web.u0 u0Var = this.b;
        if (u0Var != null) {
            u0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = k3Var.x;
            this.r = k3Var.y;
        }
    }
}
