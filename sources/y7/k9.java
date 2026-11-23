package y7;

import c8.ge;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k9 extends l9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ l9 e;

    public k9(l9 l9Var, int i7, int i10) {
        this.e = l9Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ge.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // y7.i9
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // y7.i9
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // y7.i9
    public final Object[] k() {
        return this.e.k();
    }

    @Override // y7.l9, java.util.List
    /* renamed from: l */
    public final l9 subList(int i7, int i10) {
        ge.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
