package w6;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public k0.b a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static k0.b a(Context context) {
        k0.b bVar;
        b bVar2 = b;
        synchronized (bVar2) {
            try {
                if (bVar2.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.a = new k0.b(context, false);
                }
                bVar = bVar2.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
