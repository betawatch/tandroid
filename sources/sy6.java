// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class sy6 implements iz6, jz6, fu2 {
    public final /* synthetic */ oz6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ sy6(oz6 oz6Var, int i, int i2) {
        this.a = oz6Var;
        this.b = i;
        this.c = i2;
    }

    @Override // jz6
    public final void a(cf8 cf8Var, sw6 sw6Var, List list) {
        oz6 oz6Var = this.a;
        cf8Var.r0(list, oz6Var.f(sw6Var, cf8Var, this.b), oz6Var.f(sw6Var, cf8Var, this.c));
    }

    @Override // fu2
    public final void accept(Object obj) {
        oz6 oz6Var = this.a;
        ((tx6) oz6Var.a.get()).getClass();
        mz6 mz6Var = oz6Var.n;
        if (mz6Var != null) {
            mz6Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // iz6
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        oz6 oz6Var = this.a;
        cf8Var.P(oz6Var.f(sw6Var, cf8Var, this.b), oz6Var.f(sw6Var, cf8Var, this.c));
    }
}
