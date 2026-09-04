package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z2 extends org.telegram.ui.ActionBar.n3 {
    @Override // org.telegram.ui.ActionBar.n3
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.b;
        return (z0Var == null || TextUtils.isEmpty(z0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(m3 m3Var) {
        if (m3Var == null) {
            return;
        }
        k3 k3Var = m3Var.f;
        k3Var.M();
        this.b = k3Var.getWebView();
        this.d = k3Var.getProxy();
        org.telegram.ui.web.z0 z0Var = this.b;
        if (z0Var != null) {
            z0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = m3Var.w;
            this.r = m3Var.x;
        }
    }
}
