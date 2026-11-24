// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uze extends AbstractList implements ere, RandomAccess {
    public final pqe a;

    public uze(pqe pqeVar) {
        this.a = pqeVar;
    }

    @Override // ere
    public final Object d(int i) {
        return this.a.b.get(i);
    }

    @Override // ere
    public final void e(sie sieVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dcd dcdVar = new dcd((byte) 3);
        dcdVar.b = this.a.iterator();
        return dcdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fzd fzdVar = new fzd((byte) 1);
        fzdVar.b = this.a.listIterator(i);
        return fzdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // ere
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // ere
    public final ere zze() {
        return this;
    }
}
