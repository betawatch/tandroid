// default package

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xsd extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ etd a;

    public xsd(etd etdVar) {
        this.a = etdVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        etd etdVar = this.a;
        synchronized (etdVar.h) {
            if (etdVar.d == null || etdVar.e == null) {
                return;
            }
            etd.j.b("the network is lost", new Object[0]);
            if (etdVar.e.remove(network)) {
                etdVar.d.remove(network);
            }
            etdVar.b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        etd etdVar = this.a;
        synchronized (etdVar.h) {
            if (etdVar.d == null || etdVar.e == null) {
                return;
            }
            etd.j.b("all networks are unavailable.", new Object[0]);
            etdVar.d.clear();
            etdVar.e.clear();
            etdVar.b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
