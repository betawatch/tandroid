package w6;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public q2.b a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static q2.b a(Context context) {
        q2.b bVar;
        b bVar2 = b;
        synchronized (bVar2) {
            try {
                if (bVar2.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.a = new q2.b(context, 2);
                }
                bVar = bVar2.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
