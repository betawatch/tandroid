package w6;

import android.content.Context;
import k6.h;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
