// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum rqb extends qsb {
    public rqb() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.e();
            aqbVar.h.append(zj1Var.i());
            aqbVar.h("<" + zj1Var.i());
            aqbVar.a(qsb.R);
            return;
        }
        if (zj1Var.m('/')) {
            aqbVar.e();
            aqbVar.a(qsb.P);
        } else {
            aqbVar.f('<');
            aqbVar.c = qsb.L;
        }
    }
}
