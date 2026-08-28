package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y01 implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ y01(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i9 < proxyListActivity.r || i9 >= proxyListActivity.s) {
            return false;
        }
        proxyListActivity.a.G(i9);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ProxyListActivity.U(this.a);
    }
}
