package w6;

import android.content.Context;
import v0.k;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
