package v5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    private final void a() {
        j jVar = this.b;
        synchronized (jVar) {
            if (jVar.a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.b;
            synchronized (jVar) {
                try {
                    if (jVar.a != 2) {
                        return;
                    }
                    if (jVar.d.isEmpty()) {
                        jVar.c();
                        return;
                    }
                    k kVar = (k) jVar.d.poll();
                    jVar.e.put(kVar.a, kVar);
                    ((ScheduledExecutorService) jVar.f.c).schedule(new od.i(jVar, kVar, false, 12), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                    }
                    l lVar = jVar.f;
                    Messenger messenger = jVar.b;
                    int i10 = kVar.c;
                    Context context = (Context) lVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = kVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kVar.d);
                    obtain.setData(bundle);
                    try {
                        oc.i iVar = jVar.c;
                        Messenger messenger2 = (Messenger) iVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) iVar.c;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e10) {
                        jVar.a(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
