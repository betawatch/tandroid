package za;

import android.os.Build;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        eVar.a(f, o.b);
        eVar.a(g, bVar.b);
    }
}
