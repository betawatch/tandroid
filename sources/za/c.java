package za;

import android.os.Build;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements ia.d {
    public static final c a = new c();
    public static final ia.c b = ia.c.c("packageName");
    public static final ia.c c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f = ia.c.c("currentProcessDetails");
    public static final ia.c g = ia.c.c("appProcessDetails");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, aVar.a);
        eVar.a(c, aVar.b);
        eVar.a(d, aVar.c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f, aVar.d);
        eVar.a(g, aVar.e);
    }
}
