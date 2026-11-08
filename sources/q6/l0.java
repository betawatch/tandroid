package q6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l0 {
    public static final Object g = new Object();
    public static l0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile com.google.android.gms.internal.cast.y c;
    public final w6.a d;
    public final long e;
    public final long f;

    public l0(Context context, Looper looper) {
        k0 k0Var = new k0(this);
        this.b = context.getApplicationContext();
        com.google.android.gms.internal.cast.y yVar = new com.google.android.gms.internal.cast.y(looper, k0Var);
        Looper.getMainLooper();
        this.c = yVar;
        this.d = w6.a.a();
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n6.a b(i0 i0Var, e0 e0Var, String str) {
        n6.a aVar;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var == null) {
                    j0Var = new j0(this, i0Var);
                    j0Var.a.put(e0Var, e0Var);
                    aVar = j0Var.a(str, null);
                    hashMap.put(i0Var, j0Var);
                } else {
                    this.c.removeMessages(0, i0Var);
                    if (j0Var.a.containsKey(e0Var)) {
                        String i0Var2 = i0Var.toString();
                        StringBuilder sb2 = new StringBuilder(i0Var2.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(i0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    j0Var.a.put(e0Var, e0Var);
                    int i7 = j0Var.b;
                    if (i7 == 1) {
                        e0Var.onServiceConnected(j0Var.f, j0Var.d);
                    } else if (i7 == 2) {
                        aVar = j0Var.a(str, null);
                    }
                    aVar = null;
                }
                if (j0Var.c) {
                    return n6.a.f;
                }
                if (aVar == null) {
                    aVar = new n6.a(-1, null, null);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z9) {
        i0 i0Var = new i0(str, str2, z9);
        m.h(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                j0 j0Var = (j0) hashMap.get(i0Var);
                if (j0Var == null) {
                    String i0Var2 = i0Var.toString();
                    StringBuilder sb2 = new StringBuilder(i0Var2.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(i0Var2);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!j0Var.a.containsKey(serviceConnection)) {
                    String i0Var3 = i0Var.toString();
                    StringBuilder sb3 = new StringBuilder(i0Var3.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(i0Var3);
                    throw new IllegalStateException(sb3.toString());
                }
                j0Var.a.remove(serviceConnection);
                if (j0Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, i0Var), this.e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
