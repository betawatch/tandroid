// default package

import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class q70 implements zq7 {
    public static final q70 a = new q70();
    public static final sa4 b = sa4.c("packageName");
    public static final sa4 c = sa4.c("versionName");
    public static final sa4 d = sa4.c("appBuildVersion");
    public static final sa4 e = sa4.c("deviceManufacturer");
    public static final sa4 f = sa4.c("currentProcessDetails");
    public static final sa4 g = sa4.c("appProcessDetails");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        yj yjVar = (yj) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, yjVar.a);
        ar7Var.a(c, yjVar.b);
        ar7Var.a(d, yjVar.c);
        ar7Var.a(e, Build.MANUFACTURER);
        ar7Var.a(f, yjVar.d);
        ar7Var.a(g, yjVar.e);
    }
}
