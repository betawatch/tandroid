// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum pqb extends qsb {
    public pqb() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.j()) {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
            return;
        }
        char d = zj1Var.d();
        oqb oqbVar = qsb.L;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.f((char) 65533);
            aqbVar.c = oqbVar;
        } else if (d == '-') {
            aqbVar.f(d);
            aqbVar.c = qsb.N;
        } else if (d == '<') {
            aqbVar.c = qsb.O;
        } else {
            aqbVar.f(d);
            aqbVar.c = oqbVar;
        }
    }
}
