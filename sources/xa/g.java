package xa;

import ag.v0;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;
import th.m1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g {
    public static final Object c = new Object();
    public static y d;
    public final Object a;
    public final Object b;

    public g(ExecutorService executorService) {
        this.b = new a0.f(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        y yVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new y(context);
                }
                yVar = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return yVar.b(intent).continueWith(new a3.b(3), new m1(24));
        }
        if (n.D().I(context)) {
            v.c(context, yVar, intent);
        } else {
            yVar.b(intent);
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
        a3.b bVar = (a3.b) this.b;
        boolean z10 = u6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & TLObject.FLAG_28) != 0;
        return (!z10 || z11) ? Tasks.call(bVar, new g2.i(3, context, intent)).continueWithTask(bVar, new v0(context, intent, z11, 12)) : a(context, intent, z11);
    }

    public g(Context context) {
        this.a = context;
        this.b = new a3.b(3);
    }

    public g(e0.r rVar, String str) {
        this.a = rVar;
        this.b = str;
    }
}
