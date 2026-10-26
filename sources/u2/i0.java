package u2;

import a8.ng;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng b;
    public final /* synthetic */ u c;
    public final /* synthetic */ c0 d;

    public /* synthetic */ i0(ng ngVar, u uVar, c0 c0Var, int i10) {
        this.a = i10;
        this.b = ngVar;
        this.c = uVar;
        this.d = c0Var;
    }

    @Override // e2.j
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.a) {
            case 0:
                ng ngVar = this.b;
                k0Var.e(ngVar.b, (g0) ngVar.c, this.c, this.d);
                break;
            default:
                ng ngVar2 = this.b;
                k0Var.j(ngVar2.b, (g0) ngVar2.c, this.c, this.d);
                break;
        }
    }
}
