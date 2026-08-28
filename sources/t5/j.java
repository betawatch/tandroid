package t5;

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
import c2.u0;
import com.google.firebase.messaging.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.fm;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public e3 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ l f;

    public j(l lVar) {
        this.f = lVar;
        u0 u0Var = new u0(Looper.getMainLooper(), new Handler.Callback() { // from class: t5.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i9 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i9);
                }
                j jVar = j.this;
                synchronized (jVar) {
                    try {
                        k kVar = (k) jVar.e.get(i9);
                        if (kVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i9);
                            return true;
                        }
                        jVar.e.remove(i9);
                        jVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.b(new s("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (kVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    kVar.c(null);
                                    return true;
                                }
                                kVar.b(new s("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                kVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.b = new Messenger(u0Var);
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
            int i9 = this.a;
            if (i9 == 0) {
                throw new IllegalStateException();
            }
            if (i9 != 1 && i9 != 2) {
                if (i9 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            d6.a.a().b((Context) this.f.b, this);
            s sVar = new s(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((k) it.next()).b(sVar);
            }
            this.d.clear();
            for (int i10 = 0; i10 < this.e.size(); i10++) {
                ((k) this.e.valueAt(i10)).b(sVar);
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
                d6.a.a().b((Context) this.f.b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(k kVar) {
        Throwable th;
        int i9;
        d6.a a2;
        Context context;
        try {
            try {
                i9 = this.a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i9 != 0) {
                    if (i9 == 1) {
                        this.d.add(kVar);
                        return true;
                    }
                    if (i9 != 2) {
                        return false;
                    }
                    this.d.add(kVar);
                    ((ScheduledExecutorService) this.f.c).execute(new h(this, 0));
                    return true;
                }
                this.d.add(kVar);
                x5.l.k(this.a == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a2 = d6.a.a();
                    context = (Context) this.f.b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (a2.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f.c).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e11) {
                    e = e11;
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
        ((ScheduledExecutorService) this.f.c).execute(new fm(this, iBinder, false, 6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new h(this, 2));
    }
}
