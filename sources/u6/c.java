package u6;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.u0;
import f0.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c extends e {
    public static void g(Context context, u0 u0Var, IntentFilter intentFilter) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            context.registerReceiver(u0Var, intentFilter, i9 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(u0Var, intentFilter);
        }
    }
}
