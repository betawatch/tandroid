package p4;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements z0, a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p0(d1 d1Var, int i7, int i10) {
        this.a = i10;
        this.b = d1Var;
        this.c = i7;
    }

    @Override // p4.a1
    public void a(h1 h1Var, v vVar, List list) {
        switch (this.a) {
            case 1:
                h1Var.c0(this.b.m1(vVar, h1Var, this.c), list);
                break;
            case 2:
                d1 d1Var = this.b;
                d1Var.getClass();
                int size = list.size();
                int i7 = this.c;
                if (size != 1) {
                    h1Var.t0(list, d1Var.m1(vVar, h1Var, i7), d1Var.m1(vVar, h1Var, i7 + 1));
                    break;
                } else {
                    h1Var.p(d1Var.m1(vVar, h1Var, i7), (e2.l0) list.get(0));
                    break;
                }
            default:
                h1Var.c0(this.b.m1(vVar, h1Var, this.c), list);
                break;
        }
    }

    @Override // p4.z0
    public void c(h1 h1Var, v vVar) {
        switch (this.a) {
            case 0:
                h1Var.Z(this.b.m1(vVar, h1Var, this.c));
                break;
            default:
                h1Var.R(this.b.m1(vVar, h1Var, this.c));
                break;
        }
    }
}
