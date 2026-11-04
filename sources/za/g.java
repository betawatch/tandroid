package za;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import ci.l3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public static final Object c = new Object();
    public static a0 d;
    public final Object a;
    public final Object b;

    public g(ExecutorService executorService) {
        this.b = new a0.f(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        a0 a0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new a0(context);
                }
                a0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return a0Var.b(intent).continueWith(new c3.b(3), new z9.j(6));
        }
        if (p.r().t(context)) {
            x.c(context, a0Var, intent);
        } else {
            a0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.a;
        c3.b bVar = (c3.b) this.b;
        boolean z10 = w6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & TLObject.FLAG_28) != 0;
        return (!z10 || z11) ? Tasks.call(bVar, new i2.i(3, context, intent)).continueWithTask(bVar, new l3(context, intent, z11, 12)) : a(context, intent, z11);
    }

    public g(Context context) {
        this.a = context;
        this.b = new c3.b(3);
    }

    public g(e0.q qVar, String str) {
        this.a = qVar;
        this.b = str;
    }
}
