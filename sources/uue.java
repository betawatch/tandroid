// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class uue {
    public static void a(p99 p99Var, ylb ylbVar) {
        p99Var.p(cmb.v0(cmb.Ei, ylbVar), ylbVar != null ? ylbVar.a() : cmb.I.o());
    }

    public static int b(ll0 ll0Var) {
        if (ll0Var == null) {
            return 0;
        }
        return c(ll0Var) + (Math.max(0, ll0Var.c) > 0 ? gm.L(aq1.h(r4, 1, 24, 28)) : 0);
    }

    public static int c(ll0 ll0Var) {
        if ((ll0Var == null ? 0 : ll0Var.k.size()) <= 0) {
            return 0;
        }
        return gm.L(((r1 - 1) << 4) + 12);
    }

    public static int d(ll0 ll0Var) {
        if ((ll0Var == null ? 0 : ll0Var.k.size()) <= 0) {
            return 0;
        }
        return gm.L(((r1 - 1) << 4) + 8);
    }
}
