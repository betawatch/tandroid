// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zu5 extends yfb implements is4 {
    public /* synthetic */ Object a;
    public final /* synthetic */ zj8 b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu5(zj8 zj8Var, Long l, zw2 zw2Var) {
        super(2, zw2Var);
        this.b = zj8Var;
        this.c = l;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zu5 zu5Var = new zu5(this.b, this.c, zw2Var);
        zu5Var.a = obj;
        return zu5Var;
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        zu5 zu5Var = (zu5) create((sj7) obj, (zw2) obj2);
        g9c g9cVar = g9c.a;
        zu5Var.invokeSuspend(g9cVar);
        return g9cVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        sj7 sj7Var = (sj7) this.a;
        sj7Var.getClass();
        sj7Var.d(this.b, this.c);
        return g9c.a;
    }
}
