// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class web extends BroadcastReceiver {
    public final /* synthetic */ byte a = 0;
    public Context b;
    public Object c;

    public web(y0f y0fVar) {
        this.c = y0fVar;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        ps0 ps0Var = (ps0) this.c;
        if (ps0Var != null) {
            Context context = ((FirebaseMessaging) ps0Var.d).b;
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
                ps0 ps0Var = (ps0) this.c;
                if (ps0Var != null && ps0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    ps0 ps0Var2 = (ps0) this.c;
                    Object obj = ps0Var2.d;
                    FirebaseMessaging.b(ps0Var2, 0L);
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
                    ((y0f) this.c).a();
                    b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ web() {
    }
}
