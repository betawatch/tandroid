package w6;

import android.content.Context;
import v0.k;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
