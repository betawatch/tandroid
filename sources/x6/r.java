package x6;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends n implements NavigableMap, Map {
    public static final r f;
    public final transient z c;
    public final transient m d;
    public final transient r e;

    static {
        z x10 = s.x(v.b);
        i iVar = m.b;
        f = new r(x10, x.e, null);
    }

    public r(z zVar, m mVar, r rVar) {
        this.c = zVar;
        this.d = mVar;
        this.e = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r b(TreeMap treeMap) {
        v vVar = v.b;
        Comparator comparator = treeMap.comparator();
        int i9 = 1;
        boolean equals = comparator == null ? true : vVar.equals(comparator);
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
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(n.b);
        int length = entryArr.length;
        if (length == 0) {
            return c(vVar);
        }
        int i10 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i11 = 0; i11 < 1; i11++) {
                if (objArr[i11] == null) {
                    throw new NullPointerException(j3.r0.l(i11, "at index "));
                }
            }
            z zVar = new z(m.t(1, objArr), vVar);
            Object[] objArr2 = {value};
            while (i10 < 1) {
                if (objArr2[i10] == null) {
                    throw new NullPointerException(j3.r0.l(i10, "at index "));
                }
                i10++;
            }
            return new r(zVar, m.t(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (equals) {
            while (i10 < length) {
                Map.Entry entry2 = entryArr[i10];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                a.f(key2, value2);
                objArr3[i10] = key2;
                objArr4[i10] = value2;
                i10++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new d2.a(7));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            a.f(objArr3[0], value3);
            while (i9 < length) {
                Map.Entry entry4 = entryArr[i9 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i9];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                a.f(key4, value4);
                objArr3[i9] = key4;
                objArr4[i9] = value4;
                if (vVar.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(j3.r0.o("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i9++;
                key3 = key4;
            }
        }
        return new r(new z(m.t(length, objArr3), vVar), m.t(length, objArr4), null);
    }

    public static r c(Comparator comparator) {
        if (v.b.equals(comparator)) {
            return f;
        }
        z x10 = s.x(comparator);
        i iVar = m.b;
        return new r(x10, x.e, null);
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
        return this.c.d;
    }

    @Override // java.util.NavigableMap
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final r headMap(Object obj, boolean z10) {
        obj.getClass();
        return g(0, this.c.y(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        r rVar = this.e;
        if (rVar != null) {
            return rVar;
        }
        boolean isEmpty = isEmpty();
        z zVar = this.c;
        if (!isEmpty) {
            return new r((z) zVar.descendingSet(), this.d.r(), this);
        }
        Comparator comparator = zVar.d;
        return c((comparator instanceof w ? (w) comparator : new g(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final r subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final r tailMap(Object obj, boolean z10) {
        obj.getClass();
        return g(this.c.z(obj, z10), this.d.size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().t().get(0);
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

    public final r g(int i9, int i10) {
        m mVar = this.d;
        if (i9 == 0) {
            if (i10 == mVar.size()) {
                return this;
            }
            i9 = 0;
        }
        z zVar = this.c;
        return i9 == i10 ? c(zVar.d) : new r(zVar.A(i9, i10), mVar.subList(i9, i10), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // x6.n, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        z zVar = this.c;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(zVar.f, obj, zVar.d);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.d.get(binarySearch);
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
        return (Map.Entry) entrySet().t().get(this.d.size() - 1);
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
