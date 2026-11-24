// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum vrb extends qsb {
    public vrb() {
        super("BeforeDoctypeName", 51);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        boolean o = zj1Var.o();
        wrb wrbVar = qsb.q0;
        if (o) {
            rpbVar.s();
            aqbVar.c = wrbVar;
            return;
        }
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            rpbVar.s();
            rpbVar.e.append((char) 65533);
            aqbVar.c = wrbVar;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                aqbVar.l(this);
                rpbVar.s();
                aqbVar.j();
                aqbVar.c = qsb.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            rpbVar.s();
            rpbVar.e.append(d);
            aqbVar.c = wrbVar;
        }
    }
}
