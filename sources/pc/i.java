package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // pc.j, n3.a
    public final /* bridge */ /* synthetic */ n3.a g() {
        g();
        return this;
    }

    @Override // pc.j
    /* renamed from: r */
    public final j g() {
        super.g();
        this.v = new oc.b();
        return this;
    }

    @Override // n3.a
    public final String toString() {
        oc.b bVar = this.v;
        if (bVar == null || bVar.a <= 0) {
            return "<" + o() + ">";
        }
        return "<" + o() + " " + this.v.toString() + ">";
    }
}
