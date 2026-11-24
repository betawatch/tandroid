// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q6d extends a7d {
    public final transient a7d r;

    public q6d(a7d a7dVar) {
        super((byte) 3);
        this.r = a7dVar;
    }

    @Override // a7d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a7d a7dVar = this.r;
        u3f.a(i, a7dVar.size());
        return a7dVar.get((a7dVar.size() - 1) - i);
    }

    @Override // a7d, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.r.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // a7d, java.util.List
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

    @Override // a7d
    public final a7d y() {
        return this.r;
    }

    @Override // a7d, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final a7d subList(int i, int i2) {
        a7d a7dVar = this.r;
        u3f.b(i, i2, a7dVar.size());
        return a7dVar.subList(a7dVar.size() - i2, a7dVar.size() - i).y();
    }
}
