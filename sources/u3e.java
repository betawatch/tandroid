// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class u3e extends AbstractList implements frd, RandomAccess {
    public final tqd a;

    public u3e(tqd tqdVar) {
        this.a = tqdVar;
    }

    @Override // frd
    public final List c() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        wgd wgdVar = new wgd((byte) 2);
        wgdVar.b = this.a.iterator();
        return wgdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        v3e v3eVar = new v3e((byte) 0);
        v3eVar.b = this.a.listIterator(i);
        return v3eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // frd
    public final frd g() {
        return this;
    }
}
