// default package

import j$.util.Map;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pld extends ekd implements NavigableMap, Map {
    public static final pld f;
    public final transient aod c;
    public final transient yjd d;
    public final transient pld e;

    static {
        aod E = xld.E(end.b);
        eid eidVar = yjd.n;
        f = new pld(E, qnd.w, null);
    }

    public pld(aod aodVar, yjd yjdVar, pld pldVar) {
        this.c = aodVar;
        this.d = yjdVar;
        this.e = pldVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pld c(TreeMap treeMap) {
        end endVar = end.b;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        int i2 = 0;
        boolean z = comparator == null || endVar == comparator;
        Set entrySet = treeMap.entrySet();
        if (entrySet == null) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(ekd.b);
        int length = entryArr.length;
        if (length == 0) {
            return d(endVar);
        }
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr[i3] == null) {
                    gxc.d(hg9.j(i3, "at index "));
                    return null;
                }
            }
            aod aodVar = new aod(yjd.A(1, objArr), endVar);
            Object[] objArr2 = {value};
            while (i2 < 1) {
                if (objArr2[i2] == null) {
                    gxc.d(hg9.j(i2, "at index "));
                    return null;
                }
                i2++;
            }
            return new pld(aodVar, yjd.A(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (z) {
            while (i2 < length) {
                Map.Entry entry2 = entryArr[i2];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                t2f.a(key2, value2);
                objArr3[i2] = key2;
                objArr4[i2] = value2;
                i2++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new ju6((byte) 15));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            t2f.a(objArr3[0], value3);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                t2f.a(key4, value4);
                objArr3[i] = key4;
                objArr4[i] = value4;
                if (endVar.compare(key3, key4) == 0) {
                    u36.j(td4.r("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                    return null;
                }
                i++;
                key3 = key4;
            }
        }
        return new pld(new aod(yjd.A(length, objArr3), endVar), yjd.A(length, objArr4), null);
    }

    public static pld d(Comparator comparator) {
        if (end.b == comparator) {
            return f;
        }
        aod E = xld.E(comparator);
        eid eidVar = yjd.n;
        return new pld(E, qnd.w, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.c.s;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        pld pldVar = this.e;
        if (pldVar != null) {
            return pldVar;
        }
        boolean isEmpty = isEmpty();
        aod aodVar = this.c;
        if (!isEmpty) {
            return new pld((aod) aodVar.descendingSet(), this.d.y(), this);
        }
        Comparator comparator = aodVar.s;
        return d((comparator instanceof mnd ? (mnd) comparator : new phd(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final pld headMap(Object obj, boolean z) {
        obj.getClass();
        return h(0, this.c.F(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final pld subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.s.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        u36.j(n2f.a("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final pld tailMap(Object obj, boolean z) {
        obj.getClass();
        return h(this.c.G(obj, z), this.d.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000d, code lost:
    
        if (r4 < 0) goto L6;
     */
    @Override // ekd, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        aod aodVar = this.c;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(aodVar.x, obj, aodVar.s);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.d.get(binarySearch);
    }

    public final pld h(int i, int i2) {
        yjd yjdVar = this.d;
        if (i == 0) {
            if (i2 == yjdVar.size()) {
                return this;
            }
            i = 0;
        }
        aod aodVar = this.c;
        return i == i2 ? d(aodVar.s) : new pld(aodVar.H(i, i2), yjdVar.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A().get(this.d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.d;
    }
}
