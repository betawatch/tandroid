package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // pc.j, n3.a
    public final /* bridge */ /* synthetic */ n3.a h() {
        h();
        return this;
    }

    @Override // pc.j
    /* renamed from: s */
    public final j h() {
        super.h();
        this.v = new oc.b();
        return this;
    }

    @Override // n3.a
    public final String toString() {
        oc.b bVar = this.v;
        if (bVar == null || bVar.a <= 0) {
            return "<" + q() + ">";
        }
        return "<" + q() + " " + this.v.toString() + ">";
    }
}
