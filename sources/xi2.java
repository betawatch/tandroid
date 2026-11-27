// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
