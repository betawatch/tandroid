// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ws5 extends ccb implements eq4 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lg8 b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws5(lg8 lg8Var, Long l, fw2 fw2Var) {
        super(2, fw2Var);
        this.b = lg8Var;
        this.c = l;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        ws5 ws5Var = new ws5(this.b, this.c, fw2Var);
        ws5Var.a = obj;
        return ws5Var;
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        ws5 ws5Var = (ws5) create((ih7) obj, (fw2) obj2);
        g5c g5cVar = g5c.a;
        ws5Var.invokeSuspend(g5cVar);
        return g5cVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        ih7 ih7Var = (ih7) this.a;
        ih7Var.getClass();
        ih7Var.d(this.b, this.c);
        return g5c.a;
    }
}
