package xa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {
    public u a;
    public final /* synthetic */ u b;

    public t(u uVar, u uVar2) {
        this.b = uVar;
        this.a = uVar2;
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
            u uVar = this.a;
            if (uVar == null) {
                return;
            }
            if (uVar.d()) {
                if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                    z10 = false;
                    if (z10) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    u uVar2 = this.a;
                    uVar2.d.f.schedule(uVar2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
                z10 = true;
                if (z10) {
                }
                u uVar22 = this.a;
                uVar22.d.f.schedule(uVar22, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
