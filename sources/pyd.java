// default package

import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pyd extends wed {
    public static final pyd c;
    public final ArrayList b;

    static {
        pyd pydVar = new pyd(new ArrayList(10));
        c = pydVar;
        pydVar.a = false;
    }

    public pyd(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        this.b.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // dpd
    public final dpd f(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            iy8.d();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new pyd(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
