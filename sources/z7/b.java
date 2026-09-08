package z7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e7 = dVar.e(entry.getKey());
                    if (e7 != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (w7.i9.a(objArr[e7], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                Map a2 = dVar.a();
                return a2 != null ? a2.entrySet().iterator() : new a(dVar, 1);
            default:
                d dVar2 = this.b;
                Map a10 = dVar2.a();
                return a10 != null ? a10.keySet().iterator() : new a(dVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.c()) {
                        int d = dVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.a;
                        obj2.getClass();
                        int[] iArr = dVar.b;
                        iArr.getClass();
                        Object[] objArr = dVar.c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = w7.e9.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.b(a10, d);
                            dVar.f--;
                            dVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.b;
                Map a11 = dVar2.a();
                return a11 != null ? a11.keySet().remove(obj) : dVar2.g(obj) != d.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
