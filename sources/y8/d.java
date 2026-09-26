package y8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class d implements x8.c {
    public final w3.b a;

    public d(w3.b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // x8.c
    public final void onChannelClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.a).onChannelClosed((x8.d) bVar, i10, i11);
    }

    @Override // x8.c
    public final void onChannelOpened(x8.b bVar) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.a).onChannelOpened((x8.d) bVar);
    }

    @Override // x8.c
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.a).onInputClosed((x8.d) bVar, i10, i11);
    }

    @Override // x8.c
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.a).onOutputClosed((x8.d) bVar, i10, i11);
    }
}
