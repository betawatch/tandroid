package w2;

import b8.kg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements g2.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg b;
    public final /* synthetic */ u c;
    public final /* synthetic */ c0 d;

    public /* synthetic */ i0(kg kgVar, u uVar, c0 c0Var, int i3) {
        this.a = i3;
        this.b = kgVar;
        this.c = uVar;
        this.d = c0Var;
    }

    @Override // g2.k
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.a) {
            case 0:
                kg kgVar = this.b;
                k0Var.t(kgVar.b, (g0) kgVar.c, this.c, this.d);
                break;
            default:
                kg kgVar2 = this.b;
                k0Var.z(kgVar2.b, (g0) kgVar2.c, this.c, this.d);
                break;
        }
    }
}
