package u7;

import c8.qc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q extends r {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r e;

    public q(r rVar, int i7, int i10) {
        this.e = rVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        qc.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // u7.o
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // u7.o
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // u7.o
    public final boolean k() {
        return true;
    }

    @Override // u7.o
    public final Object[] l() {
        return this.e.l();
    }

    @Override // u7.r, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final r subList(int i7, int i10) {
        qc.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
