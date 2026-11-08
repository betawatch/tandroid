package p4;

import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements y0, z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o0(c1 c1Var, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i7;
    }

    @Override // p4.z0
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.a) {
            case 1:
                g1Var.b0(this.b.m1(vVar, g1Var, this.c), list);
                break;
            case 2:
                c1 c1Var = this.b;
                c1Var.getClass();
                int size = list.size();
                int i7 = this.c;
                if (size != 1) {
                    g1Var.s0(list, c1Var.m1(vVar, g1Var, i7), c1Var.m1(vVar, g1Var, i7 + 1));
                    break;
                } else {
                    g1Var.o(c1Var.m1(vVar, g1Var, i7), (e2.l0) list.get(0));
                    break;
                }
            default:
                g1Var.b0(this.b.m1(vVar, g1Var, this.c), list);
                break;
        }
    }

    @Override // p4.y0
    public void c(g1 g1Var, v vVar) {
        switch (this.a) {
            case 0:
                g1Var.Y(this.b.m1(vVar, g1Var, this.c));
                break;
            default:
                g1Var.Q(this.b.m1(vVar, g1Var, this.c));
                break;
        }
    }
}
