// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
