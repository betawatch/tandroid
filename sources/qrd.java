// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qrd extends dnd {
    public final transient Object s;

    public qrd(Object obj) {
        super((byte) 4);
        this.s = obj;
    }

    @Override // dnd
    public final omd A() {
        Object[] objArr = {this.s};
        for (int i = 0; i < 1; i++) {
            ukd ukdVar = omd.n;
            if (objArr[i] == null) {
                p3d.h(uh9.k(i, "at index "));
                return null;
            }
        }
        return omd.A(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.equals(obj);
    }

    @Override // dnd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new xod(this.s);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        objArr[0] = this.s;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return qd4.y("[", this.s.toString(), "]");
    }

    @Override // b4d
    public final v9c u() {
        return new xod(this.s);
    }
}
