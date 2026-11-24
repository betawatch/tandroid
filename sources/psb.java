// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum psb extends qsb {
    public psb() {
        super("EndTagOpen", 8);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        boolean j = zj1Var.j();
        lqb lqbVar = qsb.a;
        if (j) {
            aqbVar.l(this);
            aqbVar.h("</");
            aqbVar.c = lqbVar;
        } else if (zj1Var.o()) {
            aqbVar.d(false);
            aqbVar.c = qsb.r;
        } else if (zj1Var.m('>')) {
            aqbVar.m(this);
            aqbVar.a(lqbVar);
        } else {
            aqbVar.m(this);
            aqbVar.a(qsb.g0);
        }
    }
}
