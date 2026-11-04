package p6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ d b;

    public e0(d dVar, int i3) {
        this.b = dVar;
        this.a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.b;
        if (iBinder == null) {
            dVar.y();
            return;
        }
        synchronized (dVar.m) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dVar.n = (queryLocalInterface == null || !(queryLocalInterface instanceof z)) ? new z(iBinder) : (z) queryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVar2 = this.b;
        int i3 = this.a;
        dVar2.getClass();
        g0 g0Var = new g0(dVar2, 0, null);
        c0 c0Var = dVar2.k;
        c0Var.sendMessage(c0Var.obtainMessage(7, i3, -1, g0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.b;
        synchronized (dVar.m) {
            dVar.n = null;
        }
        d dVar2 = this.b;
        int i3 = this.a;
        c0 c0Var = dVar2.k;
        c0Var.sendMessage(c0Var.obtainMessage(6, i3, 1));
    }
}
