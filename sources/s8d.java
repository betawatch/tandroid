// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s8d extends c9d {
    public final transient c9d r;

    public s8d(c9d c9dVar) {
        super((byte) 3);
        this.r = c9dVar;
    }

    @Override // c9d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        c9d c9dVar = this.r;
        w5f.a(i, c9dVar.size());
        return c9dVar.get((c9dVar.size() - 1) - i);
    }

    @Override // c9d, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.r.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // c9d, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.r.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.size();
    }

    @Override // c9d
    public final c9d y() {
        return this.r;
    }

    @Override // c9d, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final c9d subList(int i, int i2) {
        c9d c9dVar = this.r;
        w5f.b(i, i2, c9dVar.size());
        return c9dVar.subList(c9dVar.size() - i2, c9dVar.size() - i).y();
    }
}
