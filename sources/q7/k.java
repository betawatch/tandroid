package q7;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
