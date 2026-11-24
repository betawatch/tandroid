// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q5d extends jhf {
    public final transient c6d h;
    public final transient s5d n;

    public q5d(c6d c6dVar, s5d s5dVar) {
        super((byte) 3);
        this.h = c6dVar;
        this.n = s5dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.get(obj) != null;
    }

    @Override // x8d
    public final int h(Object[] objArr) {
        return this.n.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.n.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.h.getClass();
        return 1;
    }
}
