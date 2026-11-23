package y7;

import c8.fe;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class j9 extends k9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ k9 e;

    public j9(k9 k9Var, int i7, int i10) {
        this.e = k9Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        fe.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // y7.h9
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // y7.h9
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // y7.h9
    public final Object[] k() {
        return this.e.k();
    }

    @Override // y7.k9, java.util.List
    /* renamed from: l */
    public final k9 subList(int i7, int i10) {
        fe.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
