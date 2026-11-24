// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum xqb extends qsb {
    public xqb() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        char d = zj1Var.d();
        vqb vqbVar = qsb.S;
        if (d == 0) {
            aqbVar.m(this);
            aqbVar.f((char) 65533);
            aqbVar.c = vqbVar;
        } else if (d == '-') {
            aqbVar.f(d);
            aqbVar.c = qsb.U;
        } else if (d == '<') {
            aqbVar.f(d);
            aqbVar.c = qsb.V;
        } else if (d != 65535) {
            aqbVar.f(d);
            aqbVar.c = vqbVar;
        } else {
            aqbVar.l(this);
            aqbVar.c = qsb.a;
        }
    }
}
