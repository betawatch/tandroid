// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum sqb extends qsb {
    public sqb() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (!zj1Var.o()) {
            aqbVar.h("</");
            aqbVar.c = qsb.L;
            return;
        }
        aqbVar.d(false);
        vpb vpbVar = aqbVar.i;
        char i = zj1Var.i();
        vpbVar.getClass();
        vpbVar.y(String.valueOf(i));
        aqbVar.h.append(zj1Var.i());
        aqbVar.a(qsb.Q);
    }
}
