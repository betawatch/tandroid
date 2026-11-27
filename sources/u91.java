// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
