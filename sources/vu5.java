// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vu5 extends eeb implements fs4 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ni8 b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu5(ni8 ni8Var, Long l, px2 px2Var) {
        super(2, px2Var);
        this.b = ni8Var;
        this.c = l;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        vu5 vu5Var = new vu5(this.b, this.c, px2Var);
        vu5Var.a = obj;
        return vu5Var;
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        vu5 vu5Var = (vu5) create((lj7) obj, (px2) obj2);
        g7c g7cVar = g7c.a;
        vu5Var.invokeSuspend(g7cVar);
        return g7cVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        lj7 lj7Var = (lj7) this.a;
        lj7Var.getClass();
        lj7Var.d(this.b, this.c);
        return g7c.a;
    }
}
