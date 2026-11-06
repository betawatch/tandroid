package s4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h extends q {
    public final String a;
    public final g b;

    public h(String str, g gVar) {
        this.a = str;
        this.b = gVar;
    }

    @Override // s4.q
    public final void f(int i7) {
        g gVar;
        String str = this.a;
        if (str == null || (gVar = this.b) == null) {
            return;
        }
        gVar.q(i7, str);
    }

    @Override // s4.q
    public final void i(int i7) {
        g gVar;
        String str = this.a;
        if (str == null || (gVar = this.b) == null) {
            return;
        }
        gVar.r(i7, str);
    }
}
