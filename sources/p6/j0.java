package p6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final i0 e;
    public ComponentName f;
    public final /* synthetic */ l0 h;

    public j0(l0 l0Var, i0 i0Var) {
        this.h = l0Var;
        this.e = i0Var;
    }

    public final m6.a a(String str, Executor executor) {
        try {
            Intent a10 = b0.a(this.h.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(w6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                l0 l0Var = this.h;
                v6.a aVar = l0Var.d;
                Context context = l0Var.b;
                i0 i0Var = this.e;
                try {
                    boolean c2 = aVar.c(context, str, a10, this, 4225, executor);
                    this.c = c2;
                    if (c2) {
                        l0Var.c.sendMessageDelayed(l0Var.c.obtainMessage(1, i0Var), l0Var.f);
                        m6.a aVar2 = m6.a.f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return aVar2;
                    }
                    this.b = 2;
                    try {
                        l0Var.d.b(l0Var.b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    m6.a aVar3 = new m6.a(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar3;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (a0 e10) {
            return e10.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l0 l0Var = this.h;
        synchronized (l0Var.a) {
            try {
                l0Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l0 l0Var = this.h;
        synchronized (l0Var.a) {
            try {
                l0Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
