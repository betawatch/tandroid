package w6;

import android.content.Context;
import k6.h;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                    bVar.a = new h(context, 3);
                }
                hVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
