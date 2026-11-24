// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p0d implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public n0d e;
    public boolean f;

    public p0d(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new op7("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            n0d n0dVar = this.e;
            if (n0dVar == null || !n0dVar.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.e.a((o0d) this.d.poll());
        }
    }

    public final synchronized Task b(Intent intent) {
        o0d o0dVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        o0dVar = new o0d(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        o0dVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new lcc(scheduledThreadPoolExecutor.schedule(new cpc(o0dVar, (byte) 17), 20L, TimeUnit.SECONDS), (byte) 16));
        this.d.add(o0dVar);
        a();
        return o0dVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[LOOP:0: B:15:0x0050->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        p0d p0dVar;
        ArrayDeque arrayDeque;
        sz4 F;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            F = sz4.F();
            context = this.a;
            p0dVar = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                p0dVar.f = false;
                while (true) {
                    arrayDeque = p0dVar.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((o0d) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e2) {
            e = e2;
            p0dVar = this;
        }
        if (F.L(context, context.getClass().getName(), this.b, p0dVar, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        p0dVar.f = false;
        while (true) {
            arrayDeque = p0dVar.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((o0d) arrayDeque.poll()).b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f = false;
        if (iBinder instanceof n0d) {
            this.e = (n0d) iBinder;
            a();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        ArrayDeque arrayDeque = this.d;
        while (!arrayDeque.isEmpty()) {
            ((o0d) arrayDeque.poll()).b.trySetResult(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
