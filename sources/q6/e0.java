package q6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class e0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ d b;

    public e0(d dVar, int i7) {
        this.b = dVar;
        this.a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.b;
        if (iBinder == null) {
            dVar.z();
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
        int i7 = this.a;
        dVar2.getClass();
        g0 g0Var = new g0(dVar2, 0, null);
        c0 c0Var = dVar2.k;
        c0Var.sendMessage(c0Var.obtainMessage(7, i7, -1, g0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.b;
        synchronized (dVar.m) {
            dVar.n = null;
        }
        d dVar2 = this.b;
        int i7 = this.a;
        c0 c0Var = dVar2.k;
        c0Var.sendMessage(c0Var.obtainMessage(6, i7, 1));
    }
}
