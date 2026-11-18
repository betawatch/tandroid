package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x2 extends org.telegram.ui.ActionBar.f3 {
    @Override // org.telegram.ui.ActionBar.f3
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.b;
        return (s0Var == null || TextUtils.isEmpty(s0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(k3 k3Var) {
        if (k3Var == null) {
            return;
        }
        i3 i3Var = k3Var.f;
        i3Var.M();
        this.b = i3Var.getWebView();
        this.d = i3Var.getProxy();
        org.telegram.ui.web.s0 s0Var = this.b;
        if (s0Var != null) {
            s0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = k3Var.x;
            this.r = k3Var.y;
        }
    }
}
