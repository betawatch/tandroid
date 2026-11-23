package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import org.telegram.messenger.s2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class y0 implements ServiceConnection, IBinder.DeathRecipient {
    public final int a;
    public final boolean b;
    public volatile b c;
    public int d;
    public int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public long r;
    public volatile int s;
    public final long w = SystemClock.uptimeMillis();
    public final j0 x = new j0(this, 2);
    public final /* synthetic */ z0 y;

    public y0(z0 z0Var, int i7, boolean z10) {
        this.y = z0Var;
        this.a = i7;
        this.b = z10;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.y.u(this, "died");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.y.u(this, "died");
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.y.u(this, "no binding");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.utils.twidget.b] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a aVar;
        synchronized (this.y.e) {
            if (this.h) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i7 = a0.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    a aVar2 = new a();
                    aVar2.a = iBinder;
                    aVar = aVar2;
                } else {
                    aVar = (b) queryLocalInterface;
                }
                this.c = aVar;
                if (s2.a) {
                    StringBuilder sb2 = new StringBuilder("process ");
                    sb2.append(this.a);
                    sb2.append(" up in ");
                    sb2.append(SystemClock.uptimeMillis() - this.w);
                    sb2.append(" ms");
                    sb2.append(this.b ? " (app zygote)" : "");
                    Log.d("WidgetEngine", sb2.toString());
                }
                if (this.n) {
                    try {
                        aVar.b1();
                    } catch (RemoteException unused) {
                    }
                }
                this.y.e.notifyAll();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.y.u(this, "died");
    }
}
