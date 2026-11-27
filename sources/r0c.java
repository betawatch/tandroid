// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class r0c extends BroadcastReceiver {
    public s0c a;
    public final /* synthetic */ s0c b;

    public r0c(s0c s0cVar, s0c s0cVar2) {
        this.b = s0cVar;
        this.a = s0cVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        s0c s0cVar = this.a;
        if (s0cVar == null) {
            return;
        }
        if (s0cVar.d()) {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            s0c s0cVar2 = this.a;
            s0cVar2.d.e.schedule(s0cVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
