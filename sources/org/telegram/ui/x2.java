package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x2 extends org.telegram.ui.ActionBar.c3 {
    @Override // org.telegram.ui.ActionBar.c3
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
