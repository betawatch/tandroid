package w6;

import android.content.Context;
import l5.j;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public j a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new j(context, 3);
                }
                jVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
