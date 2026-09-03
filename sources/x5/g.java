package x5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.zy;
import q5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ g(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    private final void a() {
        i iVar = this.b;
        synchronized (iVar) {
            if (iVar.a == 1) {
                iVar.a("Timed out while binding");
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
            i iVar = this.b;
            synchronized (iVar) {
                try {
                    if (iVar.a != 2) {
                        return;
                    }
                    if (iVar.d.isEmpty()) {
                        iVar.c();
                        return;
                    }
                    j jVar = (j) iVar.d.poll();
                    iVar.e.put(jVar.a, jVar);
                    ((ScheduledExecutorService) iVar.f.c).schedule(new zy(iVar, jVar, false, 12), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    k kVar = iVar.f;
                    Messenger messenger = iVar.b;
                    int i10 = jVar.c;
                    Context context = (Context) kVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = jVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.d);
                    obtain.setData(bundle);
                    try {
                        c0 c0Var = iVar.c;
                        Messenger messenger2 = (Messenger) c0Var.c;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) c0Var.b;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e6) {
                        iVar.a(e6.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
