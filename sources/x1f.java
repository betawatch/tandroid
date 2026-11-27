// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class x1f {
    public static final Object a(ju9 ju9Var, ju9 ju9Var2, is4 is4Var) {
        Object yp2Var;
        Object C;
        try {
            q7c.a(2, is4Var);
            yp2Var = is4Var.invoke(ju9Var2, ju9Var);
        } catch (Throwable th) {
            yp2Var = new yp2(th, false);
        }
        vx2 vx2Var = vx2.a;
        if (yp2Var == vx2Var || (C = ju9Var.C(yp2Var)) == yed.b) {
            return vx2Var;
        }
        if (C instanceof yp2) {
            throw ((yp2) C).a;
        }
        return yed.a(C);
    }
}
