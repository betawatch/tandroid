// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
