package y8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d implements x8.a {
    public final jb.b a;

    public d(jb.b bVar) {
        this.a = bVar;
    }

    @Override // x8.a
    public final void a(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    @Override // x8.a
    public final void b(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    @Override // x8.a
    public final void c(f fVar) {
        n6.l.h(fVar, "channel must not be null");
    }

    @Override // x8.a
    public final void d(f fVar) {
        n6.l.h(fVar, "channel must not be null");
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
}
