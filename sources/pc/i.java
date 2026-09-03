package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
