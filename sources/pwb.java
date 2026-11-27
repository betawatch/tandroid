// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum pwb extends rwb {
    public pwb() {
        super("TagOpen", 7);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i == '!') {
            bubVar.a(rwb.h0);
            return;
        }
        if (i == '/') {
            bubVar.a(rwb.n);
            return;
        }
        if (i == '?') {
            bubVar.a(rwb.g0);
            return;
        }
        if (ik1Var.o()) {
            bubVar.d(true);
            bubVar.c = rwb.r;
        } else {
            bubVar.m(this);
            bubVar.f('<');
            bubVar.c = rwb.a;
        }
    }
}
