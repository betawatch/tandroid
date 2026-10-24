package u2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5.a b;
    public final /* synthetic */ v c;
    public final /* synthetic */ d0 d;

    public /* synthetic */ j0(a5.a aVar, v vVar, d0 d0Var, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = vVar;
        this.d = d0Var;
    }

    @Override // e2.j
    public final void accept(Object obj) {
        m0 m0Var = (m0) obj;
        switch (this.a) {
            case 0:
                a5.a aVar = this.b;
                m0Var.f(aVar.b, (h0) aVar.c, this.c, this.d);
                break;
            default:
                a5.a aVar2 = this.b;
                m0Var.k(aVar2.b, (h0) aVar2.c, this.c, this.d);
                break;
        }
    }
}
