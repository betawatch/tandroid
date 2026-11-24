// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum wrb extends qsb {
    public wrb() {
        super("DoctypeName", 52);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        if (zj1Var.o()) {
            rpbVar.e.append(zj1Var.e());
            return;
        }
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            rpbVar.e.append((char) 65533);
            return;
        }
        if (d != ' ') {
            lqb lqbVar = qsb.a;
            if (d == '>') {
                aqbVar.j();
                aqbVar.c = lqbVar;
                return;
            } else if (d == 65535) {
                aqbVar.l(this);
                aqbVar.j();
                aqbVar.c = lqbVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                rpbVar.e.append(d);
                return;
            }
        }
        aqbVar.c = qsb.r0;
    }
}
