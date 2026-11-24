// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w66 {
    public final t66 a;
    public final bbc b = new bbc(0.0f);
    public final bbc c = new bbc(0.0f);
    public final bbc d = new bbc(0.0f);
    public final bbc e = new bbc(0.0f);
    public final bbc f = new bbc(0.0f);
    public final bbc g = new bbc(0.0f);

    public w66(x66 x66Var, t66 t66Var) {
        this.a = t66Var;
    }

    public final void a(int i, boolean z) {
        bbc bbcVar = this.c;
        bbc bbcVar2 = this.b;
        if (z) {
            bbcVar2.c = i;
            bbcVar.c = i > 0 ? 1.0f : 0.0f;
        } else {
            bbcVar2.d(i);
            bbcVar.d(i > 0 ? 1.0f : 0.0f);
        }
    }
}
