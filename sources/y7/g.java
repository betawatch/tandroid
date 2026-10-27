package y7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ g(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
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
                i iVar = this.b;
                Map a2 = iVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = iVar.e(entry.getKey());
                    if (e != -1) {
                        Object[] objArr = iVar.d;
                        objArr.getClass();
                        if (w7.h5.a(objArr[e], entry.getValue())) {
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
                i iVar = this.b;
                Map a2 = iVar.a();
                return a2 != null ? a2.entrySet().iterator() : new f(iVar, 1);
            default:
                i iVar2 = this.b;
                Map a10 = iVar2.a();
                return a10 != null ? a10.keySet().iterator() : new f(iVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                Map a2 = iVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!iVar.c()) {
                        int d = iVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = iVar.a;
                        obj2.getClass();
                        int[] iArr = iVar.b;
                        iArr.getClass();
                        Object[] objArr = iVar.c;
                        objArr.getClass();
                        Object[] objArr2 = iVar.d;
                        objArr2.getClass();
                        int a10 = w7.d5.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            iVar.b(a10, d);
                            iVar.f--;
                            iVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                i iVar2 = this.b;
                Map a11 = iVar2.a();
                return a11 != null ? a11.keySet().remove(obj) : iVar2.g(obj) != i.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
