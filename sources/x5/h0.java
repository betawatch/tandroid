package x5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h0 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final g0 e;
    public ComponentName f;
    public final /* synthetic */ j0 h;

    public h0(j0 j0Var, g0 g0Var) {
        this.h = j0Var;
        this.e = g0Var;
    }

    public static u5.a a(h0 h0Var, String str, Executor executor) {
        try {
            Intent a2 = h0Var.e.a(h0Var.h.b);
            h0Var.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(e6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0 j0Var = h0Var.h;
                boolean c10 = j0Var.d.c(j0Var.b, str, a2, h0Var, 4225, executor);
                h0Var.c = c10;
                if (c10) {
                    h0Var.h.c.sendMessageDelayed(h0Var.h.c.obtainMessage(1, h0Var.e), h0Var.h.f);
                    u5.a aVar = u5.a.e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                h0Var.b = 2;
                try {
                    j0 j0Var2 = h0Var.h;
                    j0Var2.d.b(j0Var2.b, h0Var);
                } catch (IllegalArgumentException unused) {
                }
                u5.a aVar2 = new u5.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (z e10) {
            return e10.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.a) {
            try {
                this.h.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.a) {
            try {
                this.h.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
