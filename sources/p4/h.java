package p4;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h extends q {
    public final String a;
    public final g b;

    public h(String str, g gVar) {
        this.a = str;
        this.b = gVar;
    }

    @Override // p4.q
    public final void f(int i10) {
        g gVar;
        String str = this.a;
        if (str == null || (gVar = this.b) == null) {
            return;
        }
        gVar.q(i10, str);
    }

    @Override // p4.q
    public final void i(int i10) {
        g gVar;
        String str = this.a;
        if (str == null || (gVar = this.b) == null) {
            return;
        }
        gVar.r(i10, str);
    }
}
