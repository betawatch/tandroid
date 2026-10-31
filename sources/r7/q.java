package r7;

import w7.b7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends r {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r e;

    public q(r rVar, int i10, int i11) {
        this.e = rVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // r7.o
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // r7.o
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // r7.o
    public final boolean o() {
        return true;
    }

    @Override // r7.o
    public final Object[] p() {
        return this.e.p();
    }

    @Override // r7.r, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final r subList(int i10, int i11) {
        b7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
