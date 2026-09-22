package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y2 extends org.telegram.ui.ActionBar.n3 {
    @Override // org.telegram.ui.ActionBar.n3
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.b;
        return (z0Var == null || TextUtils.isEmpty(z0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(l3 l3Var) {
        if (l3Var == null) {
            return;
        }
        j3 j3Var = l3Var.f;
        j3Var.M();
        this.b = j3Var.getWebView();
        this.d = j3Var.getProxy();
        org.telegram.ui.web.z0 z0Var = this.b;
        if (z0Var != null) {
            z0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = l3Var.w;
            this.r = l3Var.x;
        }
    }
}
