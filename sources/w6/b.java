package w6;

import android.content.Context;
import v0.k;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
