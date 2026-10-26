package x6;

import android.content.Context;
import t6.f;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
