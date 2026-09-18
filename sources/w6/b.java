package w6;

import android.content.Context;
import v0.k;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public k a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new k(context, 1);
                }
                kVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
