// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
