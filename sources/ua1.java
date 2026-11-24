// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ua1 extends a4 {
    public final /* synthetic */ va1 n;

    public ua1(va1 va1Var) {
        this.n = va1Var;
    }

    @Override // a4
    public final String i() {
        ta1 ta1Var = (ta1) this.n.a.get();
        if (ta1Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + ta1Var.a + "]";
    }
}
