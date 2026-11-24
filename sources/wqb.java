// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum wqb extends qsb {
    public wqb() {
        super("CharacterReferenceInData", 1);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        int[] c = aqbVar.c(null, false);
        if (c == null) {
            aqbVar.f('&');
        } else {
            aqbVar.h(new String(c, 0, c.length));
        }
        aqbVar.c = qsb.a;
    }
}
