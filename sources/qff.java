// default package

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qff extends ldf implements RandomAccess, sff {
    public final List b;

    static {
        new qff();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qff(int i) {
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

    @Override // ldf, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        h();
        if (collection instanceof sff) {
            collection = ((sff) collection).zzh();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // sff
    public final Object b(int i) {
        return this.b.get(i);
    }

    @Override // ldf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        if (!(obj instanceof xdf)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, eff.a);
            lbd lbdVar = ihf.a;
            int length = bArr.length;
            lbdVar.getClass();
            if (lbd.b(length, bArr)) {
                list.set(i, str2);
            }
            return str2;
        }
        xdf xdfVar = (xdf) obj;
        Charset charset = eff.a;
        if (xdfVar.j() == 0) {
            str = "";
        } else {
            str = new String(xdfVar.b, 0, xdfVar.j(), charset);
        }
        int j = xdfVar.j();
        byte[] bArr2 = xdfVar.b;
        ihf.a.getClass();
        if (lbd.b(j, bArr2)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // ldf, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof xdf)) {
            return new String((byte[]) remove, eff.a);
        }
        xdf xdfVar = (xdf) remove;
        Charset charset = eff.a;
        if (xdfVar.j() == 0) {
            return "";
        }
        return new String(xdfVar.b, 0, xdfVar.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof xdf)) {
            return new String((byte[]) obj2, eff.a);
        }
        xdf xdfVar = (xdf) obj2;
        Charset charset = eff.a;
        if (xdfVar.j() == 0) {
            return "";
        }
        return new String(xdfVar.b, 0, xdfVar.j(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // sff
    public final sff zzd() {
        return this.a ? new ehf(this) : this;
    }

    @Override // dff
    public final dff zzg(int i) {
        List list = this.b;
        if (i < list.size()) {
            sc8.e();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new qff(arrayList);
    }

    @Override // sff
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public qff(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public qff() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // ldf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
