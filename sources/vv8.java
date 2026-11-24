// default package

import android.view.View;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv8 implements h59, ee {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ vv8(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i < proxyListActivity.n || i >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.P(i);
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        this.a.f0();
    }
}
