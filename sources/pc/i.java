package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // pc.j, n3.a
    public final /* bridge */ /* synthetic */ n3.a g() {
        g();
        return this;
    }

    @Override // pc.j
    /* renamed from: s */
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
