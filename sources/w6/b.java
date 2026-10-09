package w6;

import android.content.Context;
import k6.h;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public h a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new h(context, 4);
                }
                hVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
