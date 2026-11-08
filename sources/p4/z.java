package p4;

import m.c3;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements c0, l0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(m0 m0Var, e2.l0 l0Var, boolean z9, boolean z10) {
        this.c = m0Var;
        this.d = l0Var;
        this.a = z9;
        this.b = z10;
    }

    @Override // p4.c0
    public void b(u uVar, int i7) {
        uVar.b(i7, (l1) this.c, this.a, this.b, ((v) this.d).c);
    }

    @Override // p4.l0
    public void f(v vVar) {
        m0 m0Var = (m0) this.c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        c3 c3Var = new c3();
        c3Var.d = m0Var;
        c3Var.c = vVar;
        c3Var.a = this.a;
        c3Var.b = this.b;
        q10.b(new m9.u(0, q10, c3Var), m9.r.a);
    }

    public /* synthetic */ z(l1 l1Var, boolean z9, boolean z10, v vVar) {
        this.c = l1Var;
        this.a = z9;
        this.b = z10;
        this.d = vVar;
    }
}
