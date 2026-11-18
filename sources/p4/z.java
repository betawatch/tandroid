package p4;

import m.b3;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements c0, l0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(m0 m0Var, e2.l0 l0Var, boolean z10, boolean z11) {
        this.c = m0Var;
        this.d = l0Var;
        this.a = z10;
        this.b = z11;
    }

    @Override // p4.c0
    public void b(u uVar, int i7) {
        uVar.b(i7, (n1) this.c, this.a, this.b, ((v) this.d).c);
    }

    @Override // p4.l0
    public void f(v vVar) {
        m0 m0Var = (m0) this.c;
        m9.e0 q10 = m0Var.h.q(vVar, h9.i0.u((e2.l0) this.d), -1, -9223372036854775807L);
        b3 b3Var = new b3();
        b3Var.d = m0Var;
        b3Var.c = vVar;
        b3Var.a = this.a;
        b3Var.b = this.b;
        q10.b(new m9.u(0, q10, b3Var), m9.r.a);
    }

    public /* synthetic */ z(n1 n1Var, boolean z10, boolean z11, v vVar) {
        this.c = n1Var;
        this.a = z10;
        this.b = z11;
        this.d = vVar;
    }
}
