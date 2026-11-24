// default package

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rhf extends mff implements RandomAccess, thf {
    public final List b;

    static {
        new rhf();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhf(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        h();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // mff, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof thf) {
            collection = ((thf) collection).zzh();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // thf
    public final Object b(int i) {
        return this.b.get(i);
    }

    @Override // mff, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof yff)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, fhf.a);
            ndd nddVar = jjf.a;
            int length = bArr.length;
            nddVar.getClass();
            if (ndd.b(length, bArr)) {
                list.set(i, str2);
            }
            return str2;
        }
        yff yffVar = (yff) obj;
        Charset charset = fhf.a;
        if (yffVar.j() == 0) {
            str = "";
        } else {
            str = new String(yffVar.b, 0, yffVar.j(), charset);
        }
        int j = yffVar.j();
        byte[] bArr2 = yffVar.b;
        jjf.a.getClass();
        if (ndd.b(j, bArr2)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // mff, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof yff)) {
            return new String((byte[]) remove, fhf.a);
        }
        yff yffVar = (yff) remove;
        Charset charset = fhf.a;
        if (yffVar.j() == 0) {
            return "";
        }
        return new String(yffVar.b, 0, yffVar.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof yff)) {
            return new String((byte[]) obj2, fhf.a);
        }
        yff yffVar = (yff) obj2;
        Charset charset = fhf.a;
        if (yffVar.j() == 0) {
            return "";
        }
        return new String(yffVar.b, 0, yffVar.j(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // thf
    public final thf zzd() {
        return this.a ? new fjf(this) : this;
    }

    @Override // ehf
    public final ehf zzg(int i) {
        List list = this.b;
        if (i < list.size()) {
            i98.g();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new rhf(arrayList);
    }

    @Override // thf
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public rhf(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public rhf() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // mff, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
