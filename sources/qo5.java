// default package

import j$.util.Map;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qo5 implements Map, Serializable, j$.util.Map {
    public transient yo5 a;
    public transient yo5 b;
    public transient go5 c;

    public static qo5 b(Map map) {
        if ((map instanceof qo5) && !(map instanceof SortedMap)) {
            return (qo5) map;
        }
        Set entrySet = map.entrySet();
        kq kqVar = new kq(entrySet != null ? entrySet.size() : 4);
        kqVar.x(entrySet);
        return kqVar.e(true);
    }

    public abstract a89 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
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

    public abstract b89 d();

    public go5 e() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.Map
    public final Set entrySet() {
        yo5 yo5Var = this.a;
        if (yo5Var != null) {
            return yo5Var;
        }
        a89 c = c();
        this.a = c;
        return c;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return fqe.b(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public go5 values() {
        go5 go5Var = this.c;
        if (go5Var != null) {
            return go5Var;
        }
        go5 e = e();
        this.c = e;
        return e;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
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
        yo5 yo5Var = this.a;
        if (yo5Var == null) {
            yo5Var = c();
            this.a = yo5Var;
        }
        return bwe.c(yo5Var);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        yo5 yo5Var = this.b;
        if (yo5Var != null) {
            return yo5Var;
        }
        b89 d = d();
        this.b = d;
        return d;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
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
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        ntd.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.-CC.$default$remove(this, obj, obj2);
    }
}
