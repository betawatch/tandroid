// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum prb extends qsb {
    public prb() {
        super("Comment", 46);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char i = zj1Var.i();
        if (i == 0) {
            aqbVar.m(this);
            zj1Var.a();
            qpbVar.e.append((char) 65533);
        } else if (i == '-') {
            aqbVar.a(qsb.l0);
        } else {
            if (i != 65535) {
                qpbVar.e.append(zj1Var.g('-', 0));
                return;
            }
            aqbVar.l(this);
            aqbVar.i();
            aqbVar.c = qsb.a;
        }
    }
}
