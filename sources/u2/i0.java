package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements e2.h {
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

    @Override // e2.h
    public final void accept(Object obj) {
        m0 m0Var = (m0) obj;
        switch (this.a) {
            case 0:
                a5.a aVar = this.b;
                m0Var.e(aVar.b, (g0) aVar.c, this.c, this.d);
                break;
            default:
                a5.a aVar2 = this.b;
                m0Var.j(aVar2.b, (g0) aVar2.c, this.c, this.d);
                break;
        }
    }
}
