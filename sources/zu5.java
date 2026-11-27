// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        zu5 zu5Var = (zu5) create((rj7) obj, (zw2) obj2);
        f9c f9cVar = f9c.a;
        zu5Var.invokeSuspend(f9cVar);
        return f9cVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        rj7 rj7Var = (rj7) this.a;
        rj7Var.getClass();
        rj7Var.d(this.b, this.c);
        return f9c.a;
    }
}
