package za;

import android.os.Build;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class d implements ia.d {
    public static final d a = new d();
    public static final ia.c b = ia.c.c("appId");
    public static final ia.c c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f = ia.c.c("logEnvironment");
    public static final ia.c g = ia.c.c("androidAppInfo");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, bVar.a);
        eVar.a(c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f, q.b);
        eVar.a(g, bVar.b);
    }
}
