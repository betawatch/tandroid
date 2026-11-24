// default package

import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ztd extends dad {
    public static final ztd c;
    public final ArrayList b;

    static {
        ztd ztdVar = new ztd(new ArrayList(10));
        c = ztdVar;
        ztdVar.a = false;
    }

    public ztd(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        this.b.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // mkd
    public final mkd f(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            sc8.e();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new ztd(arrayList2);
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
