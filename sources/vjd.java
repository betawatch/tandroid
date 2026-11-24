// default package

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vjd extends mid implements NavigableSet, Iterable, SortedSet {
    public final transient Comparator s;
    public transient vjd w;

    public vjd(Comparator comparator) {
        super((byte) 4);
        this.s = comparator;
    }

    public static yld E(Comparator comparator) {
        if (cld.b == comparator) {
            return yld.y;
        }
        dgd dgdVar = xhd.n;
        return new yld(old.w, comparator);
    }

    @Override // java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final vjd descendingSet() {
        vjd vjdVar = this.w;
        if (vjdVar == null) {
            yld yldVar = (yld) this;
            Comparator reverseOrder = Collections.reverseOrder(yldVar.s);
            vjdVar = yldVar.isEmpty() ? E(reverseOrder) : new yld(yldVar.x.y(), reverseOrder);
            this.w = vjdVar;
            vjdVar.w = this;
        }
        return vjdVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final yld subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.s.compare(obj, obj2) > 0) {
            sc8.e();
            return null;
        }
        yld yldVar = (yld) this;
        yld H = yldVar.H(yldVar.G(obj, z), yldVar.x.size());
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
        yld yldVar = (yld) this;
        return yldVar.H(0, yldVar.F(obj, false));
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
        yld yldVar = (yld) this;
        return yldVar.H(yldVar.G(obj, true), yldVar.x.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        yld yldVar = (yld) this;
        return yldVar.H(0, yldVar.F(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        yld yldVar = (yld) this;
        return yldVar.H(yldVar.G(obj, z), yldVar.x.size());
    }
}
