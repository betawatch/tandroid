// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r60 implements zq7 {
    public static final r60 a = new r60();
    public static final sa4 b = sa4.c("platform");
    public static final sa4 c = sa4.c("version");
    public static final sa4 d = sa4.c("buildVersion");
    public static final sa4 e = sa4.c("jailbroken");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        zz2 zz2Var = (zz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.e(b, ((m90) zz2Var).a);
        m90 m90Var = (m90) zz2Var;
        ar7Var.a(c, m90Var.b);
        ar7Var.a(d, m90Var.c);
        ar7Var.d(e, m90Var.d);
    }
}
