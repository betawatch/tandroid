// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
