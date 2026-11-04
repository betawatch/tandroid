package p6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements Handler.Callback {
    public final bb.c a;
    public final com.google.android.gms.internal.cast.z n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public u(Looper looper, bb.c cVar) {
        this.a = cVar;
        this.n = new com.google.android.gms.internal.cast.z(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.g(lVar);
        synchronized (this.r) {
            try {
                ArrayList arrayList = this.d;
                if (arrayList.contains(lVar)) {
                    String valueOf = String.valueOf(lVar);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    arrayList.add(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i3);
            Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
            return false;
        }
        com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
        synchronized (this.r) {
            try {
                if (this.e && this.a.e() && this.b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
