package u7;

import w7.x7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        x7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // u7.a
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // u7.a
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // u7.a
    public final Object[] o() {
        return this.e.o();
    }

    @Override // u7.d, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        x7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
