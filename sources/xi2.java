// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xi2 implements yma {
    public final /* synthetic */ vi2 a;
    public final /* synthetic */ zi2 b;

    public xi2(zi2 zi2Var, vi2 vi2Var) {
        this.b = zi2Var;
        this.a = vi2Var;
    }

    @Override // yma
    public final void j(int i) {
        zi2 zi2Var = this.b;
        zi2Var.t1 = i;
        zi2Var.F0(true);
    }

    @Override // yma
    public final void m() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        vi2 vi2Var = this.a;
        vi2Var.z(0 - vi2Var.getScrollX(), measuredHeight - vi2Var.getScrollY(), false);
    }
}
