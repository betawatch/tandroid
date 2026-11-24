// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class syb extends BroadcastReceiver {
    public tyb a;
    public final /* synthetic */ tyb b;

    public syb(tyb tybVar, tyb tybVar2) {
        this.b = tybVar;
        this.a = tybVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        tyb tybVar = this.a;
        if (tybVar == null) {
            return;
        }
        if (tybVar.d()) {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            tyb tybVar2 = this.a;
            tybVar2.d.e.schedule(tybVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
