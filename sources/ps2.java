// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ps2 extends z01 {
    public final x01 G;

    public ps2(int i, x01 x01Var) {
        super(i);
        this.G = x01Var;
        if (x01Var != x01.a) {
            if (i >= 1) {
                return;
            }
            bya.a(qd4.n(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + s89.a(z01.class).b() + " instead").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(Object obj, boolean z) {
        x01 x01Var = this.G;
        x01 x01Var2 = x01.c;
        g9c g9cVar = g9c.a;
        if (x01Var == x01Var2) {
            Object d = super.d(obj);
            return (!(d instanceof oj1) || (d instanceof nj1)) ? d : g9cVar;
        }
        Object obj2 = b11.d;
        qj1 qj1Var = (qj1) fx.a.getObjectVolatile(this, z01.E);
        while (true) {
            long andIncrement = z01.b.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean r = r(andIncrement, false);
            int i = b11.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (qj1Var.d != j3) {
                qj1 i3 = i(j3, qj1Var);
                if (i3 != null) {
                    qj1Var = i3;
                } else if (r) {
                    return new nj1(n());
                }
            }
            int D = D(qj1Var, i2, obj, j, obj2, r);
            if (D == 0) {
                qj1Var.b();
                return g9cVar;
            }
            if (D == 1) {
                break;
            }
            if (D != 2) {
                if (D == 3) {
                    grb.i("unexpected");
                    return null;
                }
                if (D == 4) {
                    if (j < m()) {
                        qj1Var.b();
                    }
                    return new nj1(n());
                }
                if (D == 5) {
                    qj1Var.b();
                }
            } else {
                if (r) {
                    qj1Var.i();
                    return new nj1(n());
                }
                noc nocVar = obj2 instanceof noc ? (noc) obj2 : null;
                if (nocVar != null) {
                    nocVar.a(qj1Var, i2 + i);
                }
                f((qj1Var.d * j2) + i2);
            }
        }
    }

    @Override // z01, o4a
    public final Object a(zw2 zw2Var, Object obj) {
        if (G(obj, true) instanceof nj1) {
            throw n();
        }
        return g9c.a;
    }

    @Override // z01, o4a
    public final Object d(Object obj) {
        return G(obj, false);
    }

    @Override // z01
    public final boolean u() {
        return this.G == x01.b;
    }
}
