package t7;

import x7.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q extends r {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r e;

    public q(r rVar, int i3, int i10) {
        this.e = rVar;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        y.a(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // t7.o
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // t7.o
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // t7.o
    public final boolean k() {
        return true;
    }

    @Override // t7.o
    public final Object[] l() {
        return this.e.l();
    }

    @Override // t7.r, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final r subList(int i3, int i10) {
        y.b(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
