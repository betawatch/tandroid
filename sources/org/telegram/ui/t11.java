package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t11 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ t11(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.G(i10);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.a);
    }
}
