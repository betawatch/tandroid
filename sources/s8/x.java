package s8;

import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class x implements Map, Serializable, j$.util.Map {
    public transient k0 a;
    public transient l0 b;
    public transient m0 c;

    public static x a(Map map) {
        if ((map instanceof x) && !(map instanceof SortedMap)) {
            return (x) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z4 = entrySet != null;
        b4.e0 e0Var = new b4.e0(z4 ? entrySet.size() : 4, 23);
        if (z4) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) e0Var.c;
            if (size > objArr.length) {
                e0Var.c = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            e0Var.x(entry.getKey(), entry.getValue());
        }
        return e0Var.d();
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z entrySet() {
        k0 k0Var = this.a;
        if (k0Var != null) {
            return k0Var;
        }
        n0 n0Var = (n0) this;
        k0 k0Var2 = new k0(n0Var, n0Var.e, n0Var.f);
        this.a = k0Var2;
        return k0Var2;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q values() {
        m0 m0Var = this.c;
        if (m0Var != null) {
            return m0Var;
        }
        n0 n0Var = (n0) this;
        m0 m0Var2 = new m0(1, n0Var.f, n0Var.e);
        this.c = m0Var2;
        return m0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return l.d(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return l.i(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((n0) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        l0 l0Var = this.b;
        if (l0Var != null) {
            return l0Var;
        }
        n0 n0Var = (n0) this;
        l0 l0Var2 = new l0(n0Var, new m0(0, n0Var.f, n0Var.e));
        this.b = l0Var2;
        return l0Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.-CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i10 = ((n0) this).f;
        l.c(i10, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb.append('{');
        u0 it = ((k0) entrySet()).iterator();
        boolean z4 = true;
        while (true) {
            t tVar = (t) it;
            if (!tVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) tVar.next();
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }
}
