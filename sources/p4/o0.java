package p4;

import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements a1, b1, h2.j {
    public final /* synthetic */ e1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ o0(e1 e1Var, int i7, int i10) {
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
        ((e0) e1Var.a.get()).getClass();
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
