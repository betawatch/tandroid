package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ u11(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.G(i10);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.T(this.a);
    }
}
