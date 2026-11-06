package q6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class u implements Handler.Callback {
    public final aa.n a;
    public final com.google.android.gms.internal.cast.y n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public u(Looper looper, aa.n nVar) {
        this.a = nVar;
        this.n = new com.google.android.gms.internal.cast.y(looper, this);
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
        int i7 = message.what;
        if (i7 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i7);
            Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
            return false;
        }
        com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
        synchronized (this.r) {
            try {
                if (this.e && this.a.j() && this.b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
