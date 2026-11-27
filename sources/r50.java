// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class r50 implements zq7 {
    public static final r50 a = new r50();
    public static final sa4 b = sa4.c("arch");
    public static final sa4 c = sa4.c("libraryName");
    public static final sa4 d = sa4.c("buildId");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        bz2 bz2Var = (bz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((g80) bz2Var).a);
        g80 g80Var = (g80) bz2Var;
        ar7Var.a(c, g80Var.b);
        ar7Var.a(d, g80Var.c);
    }
}
