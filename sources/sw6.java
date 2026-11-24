// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class sw6 implements ix6, jx6, us2 {
    public final /* synthetic */ ox6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ sw6(ox6 ox6Var, int i, int i2) {
        this.a = ox6Var;
        this.b = i;
        this.c = i2;
    }

    @Override // us2
    public final void accept(Object obj) {
        ox6 ox6Var = this.a;
        ((tv6) ox6Var.a.get()).getClass();
        mx6 mx6Var = ox6Var.n;
        if (mx6Var != null) {
            mx6Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // jx6
    public final void b(ad8 ad8Var, su6 su6Var, List list) {
        ox6 ox6Var = this.a;
        ad8Var.r0(list, ox6Var.f(su6Var, ad8Var, this.b), ox6Var.f(su6Var, ad8Var, this.c));
    }

    @Override // ix6
    public final void g(ad8 ad8Var, su6 su6Var) {
        ox6 ox6Var = this.a;
        ad8Var.P(ox6Var.f(su6Var, ad8Var, this.b), ox6Var.f(su6Var, ad8Var, this.c));
    }
}
