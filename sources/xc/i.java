package xc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // xc.j, f2.f
    public final /* bridge */ /* synthetic */ f2.f b() {
        b();
        return this;
    }

    @Override // xc.j
    /* renamed from: k */
    public final j b() {
        super.b();
        this.k = new wc.b();
        return this;
    }

    @Override // f2.f
    public final String toString() {
        wc.b bVar = this.k;
        if (bVar == null || bVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
