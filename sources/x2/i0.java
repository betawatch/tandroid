package x2;

import a8.xa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa b;
    public final /* synthetic */ u c;
    public final /* synthetic */ c0 d;

    public /* synthetic */ i0(xa xaVar, u uVar, c0 c0Var, int i7) {
        this.a = i7;
        this.b = xaVar;
        this.c = uVar;
        this.d = c0Var;
    }

    @Override // h2.j
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.a) {
            case 0:
                xa xaVar = this.b;
                k0Var.G(xaVar.b, (g0) xaVar.c, this.c, this.d);
                break;
            default:
                xa xaVar2 = this.b;
                k0Var.A(xaVar2.b, (g0) xaVar2.c, this.c, this.d);
                break;
        }
    }
}
