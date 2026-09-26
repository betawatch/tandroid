package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z2 extends org.telegram.ui.ActionBar.l3 {
    @Override // org.telegram.ui.ActionBar.l3
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.b;
        return (y0Var == null || TextUtils.isEmpty(y0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(m3 m3Var) {
        if (m3Var == null) {
            return;
        }
        k3 k3Var = m3Var.f;
        k3Var.M();
        this.b = k3Var.getWebView();
        this.d = k3Var.getProxy();
        org.telegram.ui.web.y0 y0Var = this.b;
        if (y0Var != null) {
            y0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = m3Var.w;
            this.r = m3Var.x;
        }
    }
}
