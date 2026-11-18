package p4;

import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements a1, b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p0(e1 e1Var, int i7, int i10) {
        this.a = i10;
        this.b = e1Var;
        this.c = i7;
    }

    @Override // p4.b1
    public void a(i1 i1Var, v vVar, List list) {
        switch (this.a) {
            case 1:
                i1Var.b0(this.b.m1(vVar, i1Var, this.c), list);
                break;
            case 2:
                e1 e1Var = this.b;
                e1Var.getClass();
                int size = list.size();
                int i7 = this.c;
                if (size != 1) {
                    i1Var.s0(list, e1Var.m1(vVar, i1Var, i7), e1Var.m1(vVar, i1Var, i7 + 1));
                    break;
                } else {
                    i1Var.o(e1Var.m1(vVar, i1Var, i7), (e2.l0) list.get(0));
                    break;
                }
            default:
                i1Var.b0(this.b.m1(vVar, i1Var, this.c), list);
                break;
        }
    }

    @Override // p4.a1
    public void c(i1 i1Var, v vVar) {
        switch (this.a) {
            case 0:
                i1Var.Y(this.b.m1(vVar, i1Var, this.c));
                break;
            default:
                i1Var.Q(this.b.m1(vVar, i1Var, this.c));
                break;
        }
    }
}
