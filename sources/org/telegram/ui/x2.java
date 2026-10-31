package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x2 extends org.telegram.ui.ActionBar.h3 {
    @Override // org.telegram.ui.ActionBar.h3
    public final String b() {
        org.telegram.ui.web.v0 v0Var = this.b;
        return (v0Var == null || TextUtils.isEmpty(v0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(l3 l3Var) {
        if (l3Var == null) {
            return;
        }
        j3 j3Var = l3Var.f;
        j3Var.L();
        this.b = j3Var.getWebView();
        this.d = j3Var.getProxy();
        org.telegram.ui.web.v0 v0Var = this.b;
        if (v0Var != null) {
            v0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = l3Var.x;
            this.r = l3Var.y;
        }
    }
}
