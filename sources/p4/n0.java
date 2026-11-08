package p4;

import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements y0, z0, h2.j {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(c1 c1Var, int i7, int i10) {
        this.a = c1Var;
        this.b = i7;
        this.c = i10;
    }

    @Override // p4.z0
    public void a(g1 g1Var, v vVar, List list) {
        c1 c1Var = this.a;
        g1Var.s0(list, c1Var.m1(vVar, g1Var, this.b), c1Var.m1(vVar, g1Var, this.c));
    }

    @Override // h2.j
    public void accept(Object obj) {
        c1 c1Var = this.a;
        ((d0) c1Var.a.get()).getClass();
        b1 b1Var = c1Var.i;
        if (b1Var != null) {
            b1Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // p4.y0
    public void c(g1 g1Var, v vVar) {
        c1 c1Var = this.a;
        g1Var.R(c1Var.m1(vVar, g1Var, this.b), c1Var.m1(vVar, g1Var, this.c));
    }
}
