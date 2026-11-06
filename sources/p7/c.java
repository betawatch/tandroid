package p7;

import c8.cb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends e {
    public final transient e c;

    public c(e eVar) {
        this.c = eVar;
    }

    @Override // p7.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        e eVar = this.c;
        cb.a(i7, eVar.size());
        return eVar.get((eVar.size() - 1) - i7);
    }

    @Override // p7.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // p7.e
    public final e l() {
        return this.c;
    }

    @Override // p7.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // p7.e, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final e subList(int i7, int i10) {
        e eVar = this.c;
        cb.b(i7, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i7).l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
