package p4;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
