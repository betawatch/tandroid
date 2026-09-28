package w6;

import android.content.Context;
import k6.h;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                    bVar.a = new h(context, (short) 0);
                }
                hVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
