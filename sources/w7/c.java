package w7;

import c8.id;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i7, int i10) {
        this.e = dVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        id.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // w7.a
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // w7.a
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // w7.a
    public final Object[] k() {
        return this.e.k();
    }

    @Override // w7.d, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final d subList(int i7, int i10) {
        id.c(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
