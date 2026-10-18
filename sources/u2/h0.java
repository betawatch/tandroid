package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5.a b;
    public final /* synthetic */ t c;
    public final /* synthetic */ b0 d;

    public /* synthetic */ h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = tVar;
        this.d = b0Var;
    }

    @Override // e2.j
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.a) {
            case 0:
                a5.a aVar = this.b;
                j0Var.f(aVar.b, (f0) aVar.c, this.c, this.d);
                break;
            default:
                a5.a aVar2 = this.b;
                j0Var.k(aVar2.b, (f0) aVar2.c, this.c, this.d);
                break;
        }
    }
}
