// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class rse {
    public static void a(n79 n79Var, wjb wjbVar) {
        n79Var.p(bkb.v0(bkb.Ei, wjbVar), wjbVar != null ? wjbVar.a() : bkb.I.o());
    }

    public static int b(lk0 lk0Var) {
        if (lk0Var == null) {
            return 0;
        }
        return c(lk0Var) + (Math.max(0, lk0Var.c) > 0 ? gl.L(oo1.h(r4, 1, 24, 28)) : 0);
    }

    public static int c(lk0 lk0Var) {
        if ((lk0Var == null ? 0 : lk0Var.k.size()) <= 0) {
            return 0;
        }
        return gl.L(((r1 - 1) << 4) + 12);
    }

    public static int d(lk0 lk0Var) {
        if ((lk0Var == null ? 0 : lk0Var.k.size()) <= 0) {
            return 0;
        }
        return gl.L(((r1 - 1) << 4) + 8);
    }
}
