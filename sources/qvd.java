// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qvd implements ServiceConnection {
    public final int a;
    public final /* synthetic */ hh0 b;

    public qvd(hh0 hh0Var, int i) {
        this.b = hh0Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hh0 hh0Var = this.b;
        if (iBinder == null) {
            hh0Var.z();
            return;
        }
        synchronized (hh0Var.m) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hh0Var.n = (queryLocalInterface == null || !(queryLocalInterface instanceof h7d)) ? new h7d(iBinder) : (h7d) queryLocalInterface;
        }
        hh0 hh0Var2 = this.b;
        int i = this.a;
        h8e h8eVar = new h8e(hh0Var2, 0, null);
        rdd rddVar = hh0Var2.k;
        rddVar.sendMessage(rddVar.obtainMessage(7, i, -1, h8eVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hh0 hh0Var = this.b;
        synchronized (hh0Var.m) {
            hh0Var.n = null;
        }
        hh0 hh0Var2 = this.b;
        int i = this.a;
        rdd rddVar = hh0Var2.k;
        rddVar.sendMessage(rddVar.obtainMessage(6, i, 1));
    }
}
