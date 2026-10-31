package xa;

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
import vh.d0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public w e;
    public boolean f;

    public y(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new c5.s("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                w wVar = this.e;
                if (wVar == null || !wVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((x) this.d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        x xVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            xVar = new x(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            xVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new wh.b(scheduledThreadPoolExecutor.schedule(new d0(xVar, 27), 20L, TimeUnit.SECONDS), 7));
            this.d.add(xVar);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return xVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        y yVar;
        ArrayDeque arrayDeque;
        t6.a a2;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            a2 = t6.a.a();
            context = this.a;
            yVar = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                yVar.f = false;
                while (true) {
                    arrayDeque = yVar.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((x) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e7) {
            e = e7;
            yVar = this;
        }
        if (a2.c(context, context.getClass().getName(), this.b, yVar, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        yVar.f = false;
        while (true) {
            arrayDeque = yVar.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((x) arrayDeque.poll()).b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof w) {
                this.e = (w) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((x) arrayDeque.poll()).b.trySetResult(null);
            }
        } catch (Throwable th2) {
            throw th2;
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
