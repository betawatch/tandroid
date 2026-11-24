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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oyc implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public myc e;
    public boolean f;

    public oyc(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kn7("Firebase-FirebaseInstanceIdServiceConnection"));
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
            myc mycVar = this.e;
            if (mycVar == null || !mycVar.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.e.a((nyc) this.d.poll());
        }
    }

    public final synchronized Task b(Intent intent) {
        nyc nycVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        nycVar = new nyc(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        nycVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new dkc(scheduledThreadPoolExecutor.schedule(new frc(nycVar, (byte) 10), 20L, TimeUnit.SECONDS), (byte) 12));
        this.d.add(nycVar);
        a();
        return nycVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[LOOP:0: B:15:0x0050->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        oyc oycVar;
        ArrayDeque arrayDeque;
        qx4 H;
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
            H = qx4.H();
            context = this.a;
            oycVar = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                oycVar.f = false;
                while (true) {
                    arrayDeque = oycVar.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((nyc) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e2) {
            e = e2;
            oycVar = this;
        }
        if (H.N(context, context.getClass().getName(), this.b, oycVar, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        oycVar.f = false;
        while (true) {
            arrayDeque = oycVar.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((nyc) arrayDeque.poll()).b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f = false;
        if (iBinder instanceof myc) {
            this.e = (myc) iBinder;
            a();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        ArrayDeque arrayDeque = this.d;
        while (!arrayDeque.isEmpty()) {
            ((nyc) arrayDeque.poll()).b.trySetResult(null);
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
