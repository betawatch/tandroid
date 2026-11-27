// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qgb extends BroadcastReceiver {
    public final /* synthetic */ byte a = 0;
    public Context b;
    public Object c;

    public qgb(p3f p3fVar) {
        this.c = p3fVar;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        pr0 pr0Var = (pr0) this.c;
        if (pr0Var != null) {
            Context context = ((FirebaseMessaging) pr0Var.d).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public final synchronized void b() {
        Context context = this.b;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.b = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                pr0 pr0Var = (pr0) this.c;
                if (pr0Var != null && pr0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    pr0 pr0Var2 = (pr0) this.c;
                    Object obj = pr0Var2.d;
                    FirebaseMessaging.b(pr0Var2, 0L);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    break;
                }
                break;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((p3f) this.c).a();
                    b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qgb() {
    }
}
