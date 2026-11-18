package q7;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class l extends m {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ m e;

    public l(m mVar, int i7, int i10) {
        this.e = mVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // q7.h
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // q7.h
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // q7.h
    public final Object[] l() {
        return this.e.l();
    }

    @Override // q7.m, java.util.List
    /* renamed from: n */
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
