package u2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        k0 k0Var = (k0) obj;
        switch (this.a) {
            case 0:
                a5.a aVar = this.b;
                k0Var.t(aVar.b, (g0) aVar.c, this.c, this.d);
                break;
            default:
                a5.a aVar2 = this.b;
                k0Var.L(aVar2.b, (g0) aVar2.c, this.c, this.d);
                break;
        }
    }
}
