package w6;

import android.content.Context;
import k6.h;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
