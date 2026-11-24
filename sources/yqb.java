// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum yqb extends qsb {
    public yqb() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        vqb vqbVar = qsb.S;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.f((char) 65533);
            aqbVar.c = vqbVar;
            return;
        }
        if (d == '-') {
            aqbVar.f(d);
            return;
        }
        if (d == '<') {
            aqbVar.f(d);
            aqbVar.c = qsb.V;
        } else if (d == '>') {
            aqbVar.f(d);
            aqbVar.c = qsb.f;
        } else if (d != 65535) {
            aqbVar.f(d);
            aqbVar.c = vqbVar;
        } else {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
        }
    }
}
