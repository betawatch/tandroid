// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class t70 implements zq7 {
    public static final t70 a = new t70();
    public static final sa4 b = sa4.c("processName");
    public static final sa4 c = sa4.c("pid");
    public static final sa4 d = sa4.c("importance");
    public static final sa4 e = sa4.c("defaultProcess");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        mo8 mo8Var = (mo8) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, mo8Var.a);
        ar7Var.e(c, mo8Var.b);
        ar7Var.e(d, mo8Var.c);
        ar7Var.d(e, mo8Var.d);
    }
}
