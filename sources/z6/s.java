package z6;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s extends o implements NavigableSet, c0, SortedSet {
    public final transient Comparator d;
    public transient s e;

    public s(Comparator comparator) {
        this.d = comparator;
    }

    public static z x(Comparator comparator) {
        if (v.b.equals(comparator)) {
            return z.h;
        }
        i iVar = m.b;
        return new z(x.e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(0, zVar.y(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(zVar.z(obj, true), zVar.f.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final s descendingSet() {
        s sVar = this.e;
        if (sVar == null) {
            z zVar = (z) this;
            Comparator reverseOrder = Collections.reverseOrder(zVar.d);
            sVar = zVar.isEmpty() ? x(reverseOrder) : new z(zVar.f.r(), reverseOrder);
            this.e = sVar;
            sVar.e = this;
        }
        return sVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final z subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        z zVar = (z) this;
        z A = zVar.A(zVar.z(obj, z10), zVar.f.size());
        return A.A(0, A.y(obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(0, zVar.y(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(zVar.z(obj, z10), zVar.f.size());
    }
}
