// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sse extends pge implements hte, RandomAccess {
    public final ArrayList b;

    static {
        new sse(10).a = false;
    }

    public sse(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // pge, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof hte) {
            collection = ((hte) collection).zzd();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // pge, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // hte
    public final Object d(int i) {
        return this.b.get(i);
    }

    @Override // hte
    public final void e(tke tkeVar) {
        h();
        this.b.add(tkeVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof tke)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, iqe.a);
            if (s2f.a.c(0, bArr.length, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        tke tkeVar = (tke) obj;
        String str2 = tkeVar.i() == 0 ? "" : new String(tkeVar.b, tkeVar.m(), tkeVar.i(), iqe.a);
        int m = tkeVar.m();
        if (s2f.a.c(m, tkeVar.i() + m, tkeVar.b)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // pge, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof tke)) {
            return new String((byte[]) remove, iqe.a);
        }
        tke tkeVar = (tke) remove;
        return tkeVar.i() == 0 ? "" : new String(tkeVar.b, tkeVar.m(), tkeVar.i(), iqe.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof tke)) {
            return new String((byte[]) obj2, iqe.a);
        }
        tke tkeVar = (tke) obj2;
        return tkeVar.i() == 0 ? "" : new String(tkeVar.b, tkeVar.m(), tkeVar.i(), iqe.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // nre
    public final nre zza(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            i98.g();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new sse(arrayList2);
    }

    @Override // hte
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // hte
    public final hte zze() {
        return this.a ? new w1f(this) : this;
    }

    public sse(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // pge, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
