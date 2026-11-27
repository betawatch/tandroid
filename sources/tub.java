// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum tub extends rwb {
    public tub() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (!ik1Var.o()) {
            bubVar.h("</");
            bubVar.c = rwb.L;
            return;
        }
        bubVar.d(false);
        wtb wtbVar = bubVar.i;
        char i = ik1Var.i();
        wtbVar.getClass();
        wtbVar.y(String.valueOf(i));
        bubVar.h.append(ik1Var.i());
        bubVar.a(rwb.Q);
    }
}
