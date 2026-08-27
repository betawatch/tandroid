package u5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import c2.t0;
import com.google.firebase.messaging.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o0.m;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public i6 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ k f;

    public i(k kVar) {
        this.f = kVar;
        t0 t0Var = new t0(Looper.getMainLooper(), new Handler.Callback() { // from class: u5.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                i iVar = i.this;
                synchronized (iVar) {
                    try {
                        j jVar = (j) iVar.e.get(i10);
                        if (jVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        iVar.e.remove(i10);
                        iVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            jVar.b(new s("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (jVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    jVar.c(null);
                                    return true;
                                }
                                jVar.b(new s("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                jVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.b = new Messenger(t0Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            e6.a.a().b((Context) this.f.b, this);
            s sVar = new s(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b(sVar);
            }
            this.d.clear();
            for (int i11 = 0; i11 < this.e.size(); i11++) {
                ((j) this.e.valueAt(i11)).b(sVar);
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                e6.a.a().b((Context) this.f.b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(j jVar) {
        Throwable th;
        int i10;
        e6.a a2;
        Context context;
        try {
            try {
                i10 = this.a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.d.add(jVar);
                        return true;
                    }
                    if (i10 != 2) {
                        return false;
                    }
                    this.d.add(jVar);
                    ((ScheduledExecutorService) this.f.c).execute(new g(this, 0));
                    return true;
                }
                this.d.add(jVar);
                y5.l.k(this.a == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a2 = e6.a.a();
                    context = (Context) this.f.b;
                } catch (SecurityException e9) {
                    e = e9;
                }
                try {
                    if (a2.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f.c).schedule(new g(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e10) {
                    e = e10;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new m(7, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new g(this, 2));
    }
}
