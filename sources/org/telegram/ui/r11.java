package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ r11(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) {
            return false;
        }
        proxyListActivity.a.G(i10);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ProxyListActivity.V(this.a);
    }
}
