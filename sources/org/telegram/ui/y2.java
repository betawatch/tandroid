package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y2 extends org.telegram.ui.ActionBar.a3 {
    @Override // org.telegram.ui.ActionBar.a3
    public final String b() {
        org.telegram.ui.web.t0 t0Var = this.b;
        return (t0Var == null || TextUtils.isEmpty(t0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(l3 l3Var) {
        if (l3Var == null) {
            return;
        }
        j3 j3Var = l3Var.f;
        j3Var.L();
        this.b = j3Var.getWebView();
        this.d = j3Var.getProxy();
        org.telegram.ui.web.t0 t0Var = this.b;
        if (t0Var != null) {
            t0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = l3Var.x;
            this.r = l3Var.y;
        }
    }
}
