package z7;

import c8.le;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class sa extends ta {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ta e;

    public sa(ta taVar, int i7, int i10) {
        this.e = taVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        le.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // z7.l9
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // z7.l9
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // z7.l9
    public final Object[] k() {
        return this.e.k();
    }

    @Override // z7.ta, java.util.List
    /* renamed from: l */
    public final ta subList(int i7, int i10) {
        le.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
