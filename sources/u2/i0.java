package u2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5.a b;
    public final /* synthetic */ u c;
    public final /* synthetic */ c0 d;

    public /* synthetic */ i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = uVar;
        this.d = c0Var;
    }

    @Override // e2.j
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        switch (this.a) {
            case 0:
                a5.a aVar = this.b;
                l0Var.f(aVar.b, (g0) aVar.c, this.c, this.d);
                break;
            default:
                a5.a aVar2 = this.b;
                l0Var.k(aVar2.b, (g0) aVar2.c, this.c, this.d);
                break;
        }
    }
}
