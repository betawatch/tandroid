// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import org.telegram.utils.twidget.n;
import org.telegram.utils.twidget.o;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zxc implements ServiceConnection, IBinder.DeathRecipient {
    public final /* synthetic */ x E;
    public final int a;
    public final boolean b;
    public final boolean c;
    public volatile gl5 d;
    public int e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public long s;
    public volatile int w;
    public final long x = SystemClock.uptimeMillis();
    public final cpc y = new cpc(this, (byte) 16);

    public zxc(x xVar, int i, boolean z, boolean z2) {
        this.E = xVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.E.q(this, "died");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.E.q(this, "died");
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.E.q(this, "no binding");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [gl5] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fl5 fl5Var;
        synchronized (this.E.a) {
            if (this.n) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i = n.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof gl5)) {
                    fl5 fl5Var2 = new fl5();
                    fl5Var2.a = iBinder;
                    fl5Var = fl5Var2;
                } else {
                    fl5Var = (gl5) queryLocalInterface;
                }
                try {
                    fl5Var.v(o.b());
                    this.d = fl5Var;
                    if (e21.a) {
                        StringBuilder sb = new StringBuilder("process ");
                        sb.append(this.a);
                        sb.append(" up in ");
                        sb.append(SystemClock.uptimeMillis() - this.x);
                        sb.append(" ms");
                        sb.append(this.b ? " (app zygote)" : "");
                        Log.d("WidgetEngine", sb.toString());
                    }
                    if (this.r) {
                        try {
                            fl5Var.L();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.E.a.notifyAll();
                } catch (RemoteException unused2) {
                }
            } catch (RemoteException unused3) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.E.q(this, "died");
    }
}
