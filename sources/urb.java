// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum urb extends qsb {
    public urb() {
        super("Doctype", 50);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        vrb vrbVar = qsb.p0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            aqbVar.c = vrbVar;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                aqbVar.m(this);
                aqbVar.c = vrbVar;
                return;
            }
            aqbVar.l(this);
        }
        aqbVar.m(this);
        aqbVar.m.s();
        aqbVar.j();
        aqbVar.c = qsb.a;
    }
}
