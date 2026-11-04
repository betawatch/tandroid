package p7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends n {
    public final transient n c;

    public l(n nVar) {
        this.c = nVar;
    }

    @Override // p7.n, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        n nVar = this.c;
        a.e(i3, nVar.size());
        return nVar.get((nVar.size() - 1) - i3);
    }

    @Override // p7.n, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // p7.n, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // p7.n
    public final n m() {
        return this.c;
    }

    @Override // p7.n, java.util.List
    /* renamed from: n */
    public final n subList(int i3, int i10) {
        n nVar = this.c;
        a.m(i3, i10, nVar.size());
        return nVar.subList(nVar.size() - i10, nVar.size() - i3).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
