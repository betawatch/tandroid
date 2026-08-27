package y5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ g b;

    public c0(g gVar, int i10) {
        this.b = gVar;
        this.a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar = this.b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.x) {
            try {
                g gVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                gVar2.y = (queryLocalInterface == null || !(queryLocalInterface instanceof y)) ? new y(iBinder) : (y) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar3 = this.b;
        int i10 = this.a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.b.x) {
            gVar = this.b;
            gVar.y = null;
        }
        int i10 = this.a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
