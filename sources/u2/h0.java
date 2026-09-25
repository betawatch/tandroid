package u2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements e2.h {
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

    @Override // e2.h
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.a) {
            case 0:
                a5.a aVar = this.b;
                j0Var.e(aVar.b, (f0) aVar.c, this.c, this.d);
                break;
            default:
                a5.a aVar2 = this.b;
                j0Var.j(aVar2.b, (f0) aVar2.c, this.c, this.d);
                break;
        }
    }
}
