package u5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c2.u0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends u0 {
    public final Context a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 4);
        this.b = dVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i9 = message.what;
        if (i9 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i9);
            return;
        }
        int i10 = e.a;
        d dVar = this.b;
        Context context = this.a;
        int d = dVar.d(context, i10);
        AtomicBoolean atomicBoolean = g.a;
        if (d == 1 || d == 2 || d == 3 || d == 9) {
            Intent b10 = dVar.b(context, "n", d);
            if (b10 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, b10, Build.VERSION.SDK_INT >= 23 ? 201326592 : TLObject.FLAG_27);
            }
            dVar.h(context, d, activity);
        }
    }
}
