// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
