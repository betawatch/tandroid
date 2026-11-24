// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum xrb extends qsb {
    public xrb() {
        super("AfterDoctypeName", 53);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        boolean j = zj1Var.j();
        lqb lqbVar = qsb.a;
        if (j) {
            aqbVar.l(this);
            aqbVar.j();
            aqbVar.c = lqbVar;
            return;
        }
        if (zj1Var.n('\t', '\n', '\r', '\f', ' ')) {
            zj1Var.a();
            return;
        }
        if (zj1Var.m('>')) {
            aqbVar.j();
            aqbVar.a(lqbVar);
        } else if (zj1Var.l("PUBLIC")) {
            aqbVar.c = qsb.s0;
        } else if (zj1Var.l("SYSTEM")) {
            aqbVar.c = qsb.y0;
        } else {
            aqbVar.m(this);
            aqbVar.a(qsb.D0);
        }
    }
}
