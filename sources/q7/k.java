package q7;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k extends m {
    public final transient m c;

    public k(m mVar) {
        this.c = mVar;
    }

    @Override // q7.m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        m mVar = this.c;
        a.e(i7, mVar.size());
        return mVar.get((mVar.size() - 1) - i7);
    }

    @Override // q7.m, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // q7.m, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // q7.m
    public final m m() {
        return this.c;
    }

    @Override // q7.m, java.util.List
    /* renamed from: n */
    public final m subList(int i7, int i10) {
        m mVar = this.c;
        a.m(i7, i10, mVar.size());
        return mVar.subList(mVar.size() - i10, mVar.size() - i7).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
