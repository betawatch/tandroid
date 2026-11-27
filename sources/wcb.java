// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
