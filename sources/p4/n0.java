package p4;

import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements a1, b1, h2.j {
    public final /* synthetic */ e1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(e1 e1Var, int i7, int i10) {
        this.a = e1Var;
        this.b = i7;
        this.c = i10;
    }

    @Override // p4.b1
    public void a(i1 i1Var, v vVar, List list) {
        e1 e1Var = this.a;
        i1Var.s0(list, e1Var.m1(vVar, i1Var, this.b), e1Var.m1(vVar, i1Var, this.c));
    }

    @Override // h2.j
    public void accept(Object obj) {
        e1 e1Var = this.a;
        ((d0) e1Var.a.get()).getClass();
        d1 d1Var = e1Var.i;
        if (d1Var != null) {
            d1Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // p4.a1
    public void c(i1 i1Var, v vVar) {
        e1 e1Var = this.a;
        i1Var.R(e1Var.m1(vVar, i1Var, this.b), e1Var.m1(vVar, i1Var, this.c));
    }
}
