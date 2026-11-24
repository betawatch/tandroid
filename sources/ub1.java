// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ub1 implements hs4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ub1(qj7 qj7Var, pj7 pj7Var) {
        this.a = (byte) 1;
        this.b = qj7Var;
    }

    @Override // hs4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((z1) obj4).invoke((Throwable) obj);
                break;
            case 1:
                qj7 qj7Var = (qj7) obj4;
                qj7.h.set(qj7Var, null);
                qj7Var.f(null);
                break;
            default:
                ((t2a) obj4).b();
                break;
        }
        return g7cVar;
    }

    public /* synthetic */ ub1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
