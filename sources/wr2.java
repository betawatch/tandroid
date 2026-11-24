// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wr2 extends q01 {
    public final o01 G;

    public wr2(int i, o01 o01Var) {
        super(i);
        this.G = o01Var;
        if (o01Var != o01.a) {
            if (i >= 1) {
                return;
            }
            v0b.a(tb4.n(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + f59.a(q01.class).b() + " instead").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(Object obj, boolean z) {
        o01 o01Var = this.G;
        o01 o01Var2 = o01.c;
        g5c g5cVar = g5c.a;
        if (o01Var == o01Var2) {
            Object d = super.d(obj);
            return (!(d instanceof fj1) || (d instanceof ej1)) ? d : g5cVar;
        }
        Object obj2 = s01.d;
        hj1 hj1Var = (hj1) ex.a.getObjectVolatile(this, q01.E);
        while (true) {
            long andIncrement = q01.b.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean r = r(andIncrement, false);
            int i = s01.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (hj1Var.d != j3) {
                hj1 i3 = i(j3, hj1Var);
                if (i3 != null) {
                    hj1Var = i3;
                } else if (r) {
                    return new ej1(n());
                }
            }
            int D = D(hj1Var, i2, obj, j, obj2, r);
            if (D == 0) {
                hj1Var.b();
                return g5cVar;
            }
            if (D == 1) {
                break;
            }
            if (D != 2) {
                if (D == 3) {
                    sc8.j("unexpected");
                    return null;
                }
                if (D == 4) {
                    if (j < m()) {
                        hj1Var.b();
                    }
                    return new ej1(n());
                }
                if (D == 5) {
                    hj1Var.b();
                }
            } else {
                if (r) {
                    hj1Var.i();
                    return new ej1(n());
                }
                akc akcVar = obj2 instanceof akc ? (akc) obj2 : null;
                if (akcVar != null) {
                    akcVar.a(hj1Var, i2 + i);
                }
                f((hj1Var.d * j2) + i2);
            }
        }
    }

    @Override // q01, v0a
    public final Object a(fw2 fw2Var, Object obj) {
        if (G(obj, true) instanceof ej1) {
            throw n();
        }
        return g5c.a;
    }

    @Override // q01, v0a
    public final Object d(Object obj) {
        return G(obj, false);
    }

    @Override // q01
    public final boolean u() {
        return this.G == o01.b;
    }
}
