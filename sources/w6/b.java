package w6;

import android.content.Context;
import l5.j;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
