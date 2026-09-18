package r7;

import w7.c7;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class s extends t {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ t e;

    public s(t tVar, int i10, int i11) {
        this.e = tVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // r7.q
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // r7.q
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // r7.q
    public final boolean p() {
        return true;
    }

    @Override // r7.q
    public final Object[] q() {
        return this.e.q();
    }

    @Override // r7.t, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final t subList(int i10, int i11) {
        c7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
