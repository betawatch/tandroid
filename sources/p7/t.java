package p7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t extends p implements NavigableSet, d0, SortedSet {
    public final transient Comparator d;
    public transient t e;

    public t(Comparator comparator) {
        this.d = comparator;
    }

    public static a0 s(Comparator comparator) {
        if (w.b.equals(comparator)) {
            return a0.h;
        }
        j jVar = n.b;
        return new a0(y.e, comparator);
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
        a0 a0Var = (a0) this;
        return a0Var.v(0, a0Var.t(obj, false));
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

    @Override // java.util.NavigableSet
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final t descendingSet() {
        t tVar = this.e;
        if (tVar == null) {
            a0 a0Var = (a0) this;
            Comparator reverseOrder = Collections.reverseOrder(a0Var.d);
            tVar = a0Var.isEmpty() ? s(reverseOrder) : new a0(a0Var.f.m(), reverseOrder);
            this.e = tVar;
            tVar.e = this;
        }
        return tVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final a0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        a0 a0Var = (a0) this;
        a0 v = a0Var.v(a0Var.u(obj, z10), a0Var.f.size());
        return v.v(0, v.t(obj2, z11));
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
        a0 a0Var = (a0) this;
        return a0Var.v(a0Var.u(obj, true), a0Var.f.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.v(0, a0Var.t(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.v(a0Var.u(obj, z10), a0Var.f.size());
    }
}
