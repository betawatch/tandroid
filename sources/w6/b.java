package w6;

import android.content.Context;
import l5.j;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
