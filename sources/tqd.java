// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class tqd extends wed implements frd, RandomAccess {
    public final ArrayList b;

    static {
        new tqd(10).a = false;
    }

    public tqd(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // wed, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof frd) {
            collection = ((frd) collection).c();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // frd
    public final List c() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // wed, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
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
        return new tqd(arrayList2);
    }

    @Override // frd
    public final frd g() {
        return this.a ? new u3e(this) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (b5e.a.b(r0, 0, r0.length) != false) goto L17;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof vhd) {
            vhd vhdVar = (vhd) obj;
            str = vhdVar.size() == 0 ? "" : new String(vhdVar.b, vhdVar.h(), vhdVar.size(), vnd.a);
            int h = vhdVar.h();
            if (!b5e.a.b(vhdVar.b, h, vhdVar.size() + h)) {
                return str;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, vnd.a);
        }
        arrayList.set(i, str);
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof vhd)) {
            return new String((byte[]) remove, vnd.a);
        }
        vhd vhdVar = (vhd) remove;
        return vhdVar.size() == 0 ? "" : new String(vhdVar.b, vhdVar.h(), vhdVar.size(), vnd.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof vhd)) {
            return new String((byte[]) obj2, vnd.a);
        }
        vhd vhdVar = (vhd) obj2;
        return vhdVar.size() == 0 ? "" : new String(vhdVar.b, vhdVar.h(), vhdVar.size(), vnd.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public tqd(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // wed, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
