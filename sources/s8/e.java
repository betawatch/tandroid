package s8;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends h implements NavigableSet {
    public final /* synthetic */ e0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e0 e0Var, NavigableMap navigableMap) {
        super(e0Var, navigableMap);
        this.e = e0Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return i().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((c) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new e(this.e, i().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return i().floorKey(obj);
    }

    @Override // s8.h, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return i().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return i().lowerKey(obj);
    }

    @Override // s8.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final NavigableMap i() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        l7.c cVar = (l7.c) iterator();
        if (!cVar.hasNext()) {
            return null;
        }
        Object next = cVar.next();
        cVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // s8.h, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // s8.h, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        return new e(this.e, i().headMap(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z4, Object obj2, boolean z10) {
        return new e(this.e, i().subMap(obj, z4, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        return new e(this.e, i().tailMap(obj, z4));
    }
}
