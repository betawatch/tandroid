// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y8b implements vd3 {
    @Override // vd3
    public final void a(ugb ugbVar, ugb ugbVar2, int i) {
        x8b x8bVar = new x8b();
        tg6 tg6Var = (tg6) ugbVar.f;
        while (tg6Var != null && tg6Var != ugbVar2) {
            tg6 tg6Var2 = (tg6) tg6Var.f;
            x8bVar.b(tg6Var);
            tg6Var = tg6Var2;
        }
        x8bVar.g();
        tg6 tg6Var3 = (tg6) ugbVar.f;
        x8bVar.f = tg6Var3;
        if (tg6Var3 != null) {
            tg6Var3.e = x8bVar;
        }
        x8bVar.e = ugbVar;
        ugbVar.f = x8bVar;
        tg6 tg6Var4 = (tg6) ugbVar.b;
        x8bVar.b = tg6Var4;
        if (((tg6) x8bVar.f) == null) {
            tg6Var4.d = x8bVar;
        }
    }

    @Override // vd3
    public final char b() {
        return '~';
    }

    @Override // vd3
    public final int c() {
        return 2;
    }

    @Override // vd3
    public final int d(ud3 ud3Var, ud3 ud3Var2) {
        return (ud3Var.g < 2 || ud3Var2.g < 2) ? 0 : 2;
    }

    @Override // vd3
    public final char e() {
        return '~';
    }
}
