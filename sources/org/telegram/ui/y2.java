package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y2 extends org.telegram.ui.ActionBar.o3 {
    @Override // org.telegram.ui.ActionBar.o3
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
