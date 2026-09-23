package w6;

import android.content.Context;
import v0.k;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
