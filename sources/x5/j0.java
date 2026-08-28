package x5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import c2.u0;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j0 {
    public static final Object g = new Object();
    public static j0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile u0 c;
    public final d6.a d;
    public final long e;
    public final long f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.b = context.getApplicationContext();
        u0 u0Var = new u0(looper, i0Var);
        Looper.getMainLooper();
        this.c = u0Var;
        this.d = d6.a.a();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u5.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.a) {
            try {
                h0 h0Var = (h0) this.a.get(g0Var);
                u5.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.a.put(g0Var, h0Var);
                } else {
                    this.c.removeMessages(0, g0Var);
                    if (h0Var.a.containsKey(c0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                    h0Var.a.put(c0Var, c0Var);
                    int i9 = h0Var.b;
                    if (i9 == 1) {
                        c0Var.onServiceConnected(h0Var.f, h0Var.d);
                    } else if (i9 == 2) {
                        aVar = h0.a(h0Var, str, null);
                    }
                }
                if (h0Var.c) {
                    return u5.a.e;
                }
                if (aVar == null) {
                    aVar = new u5.a(-1);
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                h0 h0Var = (h0) this.a.get(g0Var);
                if (h0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
                if (!h0Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                }
                h0Var.a.remove(serviceConnection);
                if (h0Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, g0Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
