// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xy6 implements mz6, nz6, ot2 {
    public final /* synthetic */ sz6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ xy6(sz6 sz6Var, int i, int i2) {
        this.a = sz6Var;
        this.b = i;
        this.c = i2;
    }

    @Override // nz6
    public final void a(og8 og8Var, xw6 xw6Var, List list) {
        sz6 sz6Var = this.a;
        og8Var.r0(list, sz6Var.f(xw6Var, og8Var, this.b), sz6Var.f(xw6Var, og8Var, this.c));
    }

    @Override // ot2
    public final void accept(Object obj) {
        sz6 sz6Var = this.a;
        ((yx6) sz6Var.a.get()).getClass();
        qz6 qz6Var = sz6Var.n;
        if (qz6Var != null) {
            qz6Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // mz6
    public final void d(og8 og8Var, xw6 xw6Var) {
        sz6 sz6Var = this.a;
        og8Var.P(sz6Var.f(xw6Var, og8Var, this.b), sz6Var.f(xw6Var, og8Var, this.c));
    }
}
