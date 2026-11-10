package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ qx0(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.M(i7);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ProxyListActivity.a0(this.a);
    }
}
