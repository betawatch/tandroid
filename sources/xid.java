// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xid extends ofd {
    public final transient djd h;
    public final transient ajd n;

    public xid(djd djdVar, ajd ajdVar) {
        super((byte) 0);
        this.h = djdVar;
        this.n = ajdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.get(obj) != null;
    }

    @Override // qdd
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
