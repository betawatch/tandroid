package w6;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public k0.b a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static k0.b a(Context context) {
        k0.b bVar;
        b bVar2 = b;
        synchronized (bVar2) {
            try {
                if (bVar2.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.a = new k0.b(context, false);
                }
                bVar = bVar2.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
