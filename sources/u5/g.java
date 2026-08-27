package u5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o0.m;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                    ((ScheduledExecutorService) iVar.f.c).schedule(new m(8, iVar, jVar), 30L, TimeUnit.SECONDS);
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
                        i6 i6Var = iVar.c;
                        Messenger messenger2 = (Messenger) i6Var.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) i6Var.c;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e9) {
                        iVar.a(e9.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
