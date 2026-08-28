package x5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c2.u0;
import j3.r0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s implements Handler.Callback {
    public final android.support.v4.media.c a;
    public final u0 n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public s(Looper looper, android.support.v4.media.c cVar) {
        this.a = cVar;
        this.n = new u0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.r) {
            try {
                if (this.d.contains(lVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(lVar) + " is already registered");
                } else {
                    this.d.add(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            Log.wtf("GmsClientEvents", r0.l(i9, "Don't know how to handle message: "), new Exception());
            return false;
        }
        com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
        synchronized (this.r) {
            try {
                if (this.e && this.a.G() && this.b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
