// default package

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xld extends okd implements NavigableSet, Iterable, SortedSet {
    public final transient Comparator s;
    public transient xld w;

    public xld(Comparator comparator) {
        super((byte) 4);
        this.s = comparator;
    }

    public static aod E(Comparator comparator) {
        if (end.b == comparator) {
            return aod.y;
        }
        eid eidVar = yjd.n;
        return new aod(qnd.w, comparator);
    }

    @Override // java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final xld descendingSet() {
        xld xldVar = this.w;
        if (xldVar == null) {
            aod aodVar = (aod) this;
            Comparator reverseOrder = Collections.reverseOrder(aodVar.s);
            xldVar = aodVar.isEmpty() ? E(reverseOrder) : new aod(aodVar.x.y(), reverseOrder);
            this.w = xldVar;
            xldVar.w = this;
        }
        return xldVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final aod subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.s.compare(obj, obj2) > 0) {
            i98.g();
            return null;
        }
        aod aodVar = (aod) this;
        aod H = aodVar.H(aodVar.G(obj, z), aodVar.x.size());
        return H.H(0, H.F(obj2, z2));
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.s;
    }

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
        aod aodVar = (aod) this;
        return aodVar.H(0, aodVar.F(obj, false));
    }

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
        aod aodVar = (aod) this;
        return aodVar.H(aodVar.G(obj, true), aodVar.x.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        aod aodVar = (aod) this;
        return aodVar.H(0, aodVar.F(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        aod aodVar = (aod) this;
        return aodVar.H(aodVar.G(obj, z), aodVar.x.size());
    }
}
