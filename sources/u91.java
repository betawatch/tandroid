// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class u91 extends b4 {
    public final /* synthetic */ v91 n;

    public u91(v91 v91Var) {
        this.n = v91Var;
    }

    @Override // b4
    public final String i() {
        t91 t91Var = (t91) this.n.a.get();
        if (t91Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + t91Var.a + "]";
    }
}
