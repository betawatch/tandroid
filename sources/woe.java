// default package

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class woe implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n9f b;

    public /* synthetic */ woe(n9f n9fVar, byte b) {
        this.a = b;
        this.b = n9fVar;
    }

    private final void a() {
        while (true) {
            n9f n9fVar = this.b;
            synchronized (n9fVar) {
                if (n9fVar.a != 2) {
                    return;
                }
                ArrayDeque arrayDeque = n9fVar.d;
                if (arrayDeque.isEmpty()) {
                    n9fVar.d();
                    return;
                }
                fdf fdfVar = (fdf) arrayDeque.poll();
                SparseArray sparseArray = n9fVar.e;
                int i = fdfVar.a;
                sparseArray.put(i, fdfVar);
                ((ScheduledExecutorService) n9fVar.f.c).schedule(new us4((Object) n9fVar, (Object) fdfVar, (byte) 22), 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(fdfVar)));
                }
                jif jifVar = n9fVar.f;
                Messenger messenger = n9fVar.b;
                byte b = fdfVar.c;
                Message obtain = Message.obtain();
                obtain.what = b;
                obtain.arg1 = i;
                obtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", fdfVar.a());
                bundle.putString("pkg", ((Context) jifVar.b).getPackageName());
                bundle.putBundle("data", fdfVar.d);
                obtain.setData(bundle);
                try {
                    rhb rhbVar = n9fVar.c;
                    Messenger messenger2 = (Messenger) rhbVar.b;
                    if (messenger2 != null) {
                        messenger2.send(obtain);
                    } else {
                        kpd kpdVar = (kpd) rhbVar.c;
                        if (kpdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        kpdVar.a.send(obtain);
                    }
                } catch (RemoteException e) {
                    n9fVar.b(e.getMessage());
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n9f n9fVar = this.b;
                synchronized (n9fVar) {
                    if (n9fVar.a == 1) {
                        n9fVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.b.b("Service disconnected");
                return;
        }
    }
}
