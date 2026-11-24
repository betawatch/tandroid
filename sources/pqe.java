// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pqe extends oee implements ere, RandomAccess {
    public final ArrayList b;

    static {
        new pqe(10).a = false;
    }

    public pqe(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // oee, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof ere) {
            collection = ((ere) collection).zzd();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // oee, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // ere
    public final Object d(int i) {
        return this.b.get(i);
    }

    @Override // ere
    public final void e(sie sieVar) {
        h();
        this.b.add(sieVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof sie)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, foe.a);
            if (q0f.a.c(0, bArr.length, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        sie sieVar = (sie) obj;
        String str2 = sieVar.i() == 0 ? "" : new String(sieVar.b, sieVar.m(), sieVar.i(), foe.a);
        int m = sieVar.m();
        if (q0f.a.c(m, sieVar.i() + m, sieVar.b)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // oee, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof sie)) {
            return new String((byte[]) remove, foe.a);
        }
        sie sieVar = (sie) remove;
        return sieVar.i() == 0 ? "" : new String(sieVar.b, sieVar.m(), sieVar.i(), foe.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof sie)) {
            return new String((byte[]) obj2, foe.a);
        }
        sie sieVar = (sie) obj2;
        return sieVar.i() == 0 ? "" : new String(sieVar.b, sieVar.m(), sieVar.i(), foe.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // kpe
    public final kpe zza(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            sc8.e();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new pqe(arrayList2);
    }

    @Override // ere
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // ere
    public final ere zze() {
        return this.a ? new uze(this) : this;
    }

    public pqe(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // oee, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
