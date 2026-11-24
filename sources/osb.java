// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum osb extends qsb {
    public osb() {
        super("TagOpen", 7);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char i = zj1Var.i();
        if (i == '!') {
            aqbVar.a(qsb.h0);
            return;
        }
        if (i == '/') {
            aqbVar.a(qsb.n);
            return;
        }
        if (i == '?') {
            aqbVar.a(qsb.g0);
            return;
        }
        if (zj1Var.o()) {
            aqbVar.d(true);
            aqbVar.c = qsb.r;
        } else {
            aqbVar.m(this);
            aqbVar.f('<');
            aqbVar.c = qsb.a;
        }
    }
}
