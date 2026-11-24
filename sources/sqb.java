// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
