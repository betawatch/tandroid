package y8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class d implements x8.c {
    public final k2.w0 a;

    public d(k2.w0 w0Var) {
        this.a = w0Var;
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
        ((x8.k) this.a.b).onChannelClosed((x8.d) bVar, i10, i11);
    }

    @Override // x8.c
    public final void onChannelOpened(x8.b bVar) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.b).onChannelOpened((x8.d) bVar);
    }

    @Override // x8.c
    public final void onInputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.b).onInputClosed((x8.d) bVar, i10, i11);
    }

    @Override // x8.c
    public final void onOutputClosed(x8.b bVar, int i10, int i11) {
        n6.l.i(bVar, "channel must not be null");
        ((x8.k) this.a.b).onOutputClosed((x8.d) bVar, i10, i11);
    }
}
