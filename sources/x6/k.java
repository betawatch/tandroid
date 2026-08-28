package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends m {
    public final transient m c;

    public k(m mVar) {
        this.c = mVar;
    }

    @Override // x6.m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i9) {
        m mVar = this.c;
        a.e(i9, mVar.size());
        return mVar.get((mVar.size() - 1) - i9);
    }

    @Override // x6.m, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // x6.m, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // x6.m
    public final m r() {
        return this.c;
    }

    @Override // x6.m, java.util.List
    /* renamed from: s */
    public final m subList(int i9, int i10) {
        m mVar = this.c;
        a.m(i9, i10, mVar.size());
        return mVar.subList(mVar.size() - i10, mVar.size() - i9).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
