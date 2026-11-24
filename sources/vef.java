// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vef extends a7f {
    public final /* synthetic */ jgf n;

    public vef(jgf jgfVar) {
        this.n = jgfVar;
    }

    @Override // a7f
    public final String a() {
        j9f j9fVar = (j9f) this.n.a.get();
        return j9fVar == null ? "Completer object has been garbage collected, future will fail soon" : kt6.o("tag=[", String.valueOf(j9fVar.a), "]");
    }
}
