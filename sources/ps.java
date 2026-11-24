// default package

import j$.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ps extends aia implements Map, j$.util.Map {
    public ls d;
    public ns e;
    public js f;

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
    public final Set entrySet() {
        ls lsVar = this.d;
        if (lsVar != null) {
            return lsVar;
        }
        ls lsVar2 = new ls(this, (byte) 0);
        this.d = lsVar2;
        return lsVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.-CC.$default$forEach(this, biConsumer);
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ns nsVar = this.e;
        if (nsVar != null) {
            return nsVar;
        }
        ns nsVar2 = new ns(this);
        this.e = nsVar2;
        return nsVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        if (iArr.length < size) {
            this.a = Arrays.copyOf(iArr, size);
            this.b = Arrays.copyOf(this.b, size << 1);
        }
        if (this.c != i) {
            zf.b();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        js jsVar = this.f;
        if (jsVar != null) {
            return jsVar;
        }
        js jsVar2 = new js(this);
        this.f = jsVar2;
        return jsVar2;
    }
}
