package t5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.fm;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i9) {
        this.a = i9;
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
                    ((ScheduledExecutorService) jVar.f.c).schedule(new fm(jVar, kVar, false, 7), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                    }
                    l lVar = jVar.f;
                    Messenger messenger = jVar.b;
                    int i9 = kVar.c;
                    Context context = (Context) lVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i9;
                    obtain.arg1 = kVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kVar.d);
                    obtain.setData(bundle);
                    try {
                        e3 e3Var = jVar.c;
                        Messenger messenger2 = (Messenger) e3Var.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) e3Var.c;
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
