package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y2 extends org.telegram.ui.ActionBar.r3 {
    @Override // org.telegram.ui.ActionBar.r3
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.b;
        return (x0Var == null || TextUtils.isEmpty(x0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(m3 m3Var) {
        if (m3Var == null) {
            return;
        }
        k3 k3Var = m3Var.f;
        k3Var.L();
        this.b = k3Var.getWebView();
        this.d = k3Var.getProxy();
        org.telegram.ui.web.x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = m3Var.w;
            this.r = m3Var.x;
        }
    }
}
