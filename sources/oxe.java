// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class oxe {
    public static final Object a(long j, fs4 fs4Var, px2 px2Var) {
        Object qq2Var;
        Object C;
        if (j <= 0) {
            throw new nqb("Timed out immediately", null);
        }
        oqb oqbVar = new oqb(j, px2Var);
        pne.c(oqbVar, true, new yp3(kfe.b(oqbVar.e.getContext()).a(oqbVar.f, oqbVar, oqbVar.d)));
        try {
            r5c.a(2, fs4Var);
            qq2Var = fs4Var.invoke(oqbVar, oqbVar);
        } catch (Throwable th) {
            qq2Var = new qq2(th, false);
        }
        Object obj = ly2.a;
        if (qq2Var == obj || (C = oqbVar.C(qq2Var)) == hcd.b) {
            return obj;
        }
        if (C instanceof qq2) {
            Throwable th2 = ((qq2) C).a;
            if (!(th2 instanceof nqb)) {
                throw th2;
            }
            if (((nqb) th2).a != oqbVar) {
                throw th2;
            }
            if (qq2Var instanceof qq2) {
                throw ((qq2) qq2Var).a;
            }
        } else {
            qq2Var = hcd.a(C);
        }
        return qq2Var;
    }
}
