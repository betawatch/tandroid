package w7;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j9 extends k9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ k9 e;

    public j9(k9 k9Var, int i10, int i11) {
        this.e = k9Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // w7.h9
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // w7.h9
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // w7.h9
    public final Object[] o() {
        return this.e.o();
    }

    @Override // w7.k9, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final k9 subList(int i10, int i11) {
        z.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
