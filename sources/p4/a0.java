package p4;

import m.b3;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements d0, m0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(n0 n0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.c = n0Var;
        this.d = l0Var;
        this.a = z10;
        this.b = z11;
    }

    @Override // p4.d0
    public void b(u uVar, int i7) {
        uVar.b(i7, (n1) this.c, this.a, this.b, ((v) this.d).c);
    }

    @Override // p4.m0
    public void f(v vVar) {
        n0 n0Var = (n0) this.c;
        m9.e0 q10 = n0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        b3 b3Var = new b3();
        b3Var.d = n0Var;
        b3Var.c = vVar;
        b3Var.a = this.a;
        b3Var.b = this.b;
        q10.b(new m9.u(0, q10, b3Var), m9.r.a);
    }

    public /* synthetic */ a0(n1 n1Var, boolean z10, boolean z11, v vVar) {
        this.c = n1Var;
        this.a = z10;
        this.b = z11;
        this.d = vVar;
    }
}
