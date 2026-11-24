// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class vy6 implements iz6, jz6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oz6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vy6(oz6 oz6Var, int i, byte b) {
        this.a = b;
        this.b = oz6Var;
        this.c = i;
    }

    @Override // jz6
    public final void a(cf8 cf8Var, sw6 sw6Var, List list) {
        byte b = this.a;
        int i = this.c;
        oz6 oz6Var = this.b;
        switch (b) {
            case 1:
                cf8Var.Z(oz6Var.f(sw6Var, cf8Var, i), list);
                break;
            case 2:
                if (list.size() != 1) {
                    cf8Var.r0(list, oz6Var.f(sw6Var, cf8Var, i), oz6Var.f(sw6Var, cf8Var, i + 1));
                    break;
                } else {
                    cf8Var.A0(oz6Var.f(sw6Var, cf8Var, i), (bt6) list.get(0));
                    break;
                }
            default:
                cf8Var.Z(oz6Var.f(sw6Var, cf8Var, i), list);
                break;
        }
    }

    @Override // iz6
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        byte b = this.a;
        int i = this.c;
        oz6 oz6Var = this.b;
        switch (b) {
            case 0:
                cf8Var.W(oz6Var.f(sw6Var, cf8Var, i));
                break;
            default:
                cf8Var.O(oz6Var.f(sw6Var, cf8Var, i));
                break;
        }
    }
}
