package x6;

import android.content.Context;
import t6.f;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public f a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static f a(Context context) {
        f fVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new f(context);
                }
                fVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
