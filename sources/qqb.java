// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum qqb extends qsb {
    public qqb() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.j()) {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
            return;
        }
        char d = zj1Var.d();
        oqb oqbVar = qsb.L;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.f((char) 65533);
            aqbVar.c = oqbVar;
        } else {
            if (d == '-') {
                aqbVar.f(d);
                return;
            }
            if (d == '<') {
                aqbVar.c = qsb.O;
            } else if (d != '>') {
                aqbVar.f(d);
                aqbVar.c = oqbVar;
            } else {
                aqbVar.f(d);
                aqbVar.c = qsb.f;
            }
        }
    }
}
