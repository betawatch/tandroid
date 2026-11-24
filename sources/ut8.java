// default package

import android.view.View;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ut8 implements e39, ed {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ ut8(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i < proxyListActivity.n || i >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.P(i);
        return true;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.e0();
    }
}
