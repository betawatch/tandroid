package za;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v extends BroadcastReceiver {
    public w a;
    public final /* synthetic */ w b;

    public v(w wVar, w wVar2) {
        this.b = wVar;
        this.a = wVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0034), top: B:2:0x0001 }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onReceive(Context context, Intent intent) {
        boolean z10;
        try {
            w wVar = this.a;
            if (wVar == null) {
                return;
            }
            if (wVar.e()) {
                if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                    z10 = false;
                    if (z10) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    w wVar2 = this.a;
                    wVar2.d.e.schedule(wVar2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
                z10 = true;
                if (z10) {
                }
                w wVar22 = this.a;
                wVar22.d.e.schedule(wVar22, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
