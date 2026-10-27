package z8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
