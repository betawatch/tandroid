package p4;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements z0, a1, h2.j {
    public final /* synthetic */ d1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ o0(d1 d1Var, int i7, int i10) {
        this.a = d1Var;
        this.b = i7;
        this.c = i10;
    }

    @Override // p4.a1
    public void a(h1 h1Var, v vVar, List list) {
        d1 d1Var = this.a;
        h1Var.t0(list, d1Var.m1(vVar, h1Var, this.b), d1Var.m1(vVar, h1Var, this.c));
    }

    @Override // h2.j
    public void accept(Object obj) {
        d1 d1Var = this.a;
        ((d0) d1Var.a.get()).getClass();
        c1 c1Var = d1Var.i;
        if (c1Var != null) {
            c1Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // p4.z0
    public void c(h1 h1Var, v vVar) {
        d1 d1Var = this.a;
        h1Var.S(d1Var.m1(vVar, h1Var, this.b), d1Var.m1(vVar, h1Var, this.c));
    }
}
