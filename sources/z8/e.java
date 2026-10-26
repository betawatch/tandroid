package z8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e implements y8.c {
    public final t6.f a;

    public e(t6.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y8.c
    public final void onChannelClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.a.a).onChannelClosed((y8.d) bVar, i10, i11);
    }

    @Override // y8.c
    public final void onChannelOpened(y8.b bVar) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.a.a).onChannelOpened((y8.d) bVar);
    }

    @Override // y8.c
    public final void onInputClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.a.a).onInputClosed((y8.d) bVar, i10, i11);
    }

    @Override // y8.c
    public final void onOutputClosed(y8.b bVar, int i10, int i11) {
        o6.l.i(bVar, "channel must not be null");
        ((y8.k) this.a.a).onOutputClosed((y8.d) bVar, i10, i11);
    }
}
