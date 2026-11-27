// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wcb implements pe3 {
    @Override // pe3
    public final void a(qkb qkbVar, qkb qkbVar2, int i) {
        vcb vcbVar = new vcb();
        yi6 yi6Var = (yi6) qkbVar.f;
        while (yi6Var != null && yi6Var != qkbVar2) {
            yi6 yi6Var2 = (yi6) yi6Var.f;
            vcbVar.b(yi6Var);
            yi6Var = yi6Var2;
        }
        vcbVar.g();
        yi6 yi6Var3 = (yi6) qkbVar.f;
        vcbVar.f = yi6Var3;
        if (yi6Var3 != null) {
            yi6Var3.e = vcbVar;
        }
        vcbVar.e = qkbVar;
        qkbVar.f = vcbVar;
        yi6 yi6Var4 = (yi6) qkbVar.b;
        vcbVar.b = yi6Var4;
        if (((yi6) vcbVar.f) == null) {
            yi6Var4.d = vcbVar;
        }
    }

    @Override // pe3
    public final char b() {
        return '~';
    }

    @Override // pe3
    public final int c() {
        return 2;
    }

    @Override // pe3
    public final int d(oe3 oe3Var, oe3 oe3Var2) {
        return (oe3Var.g < 2 || oe3Var2.g < 2) ? 0 : 2;
    }

    @Override // pe3
    public final char e() {
        return '~';
    }
}
