package z7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ g(i iVar, int i3) {
        this.a = i3;
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
                Map b10 = iVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = iVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = iVar.d;
                        objArr.getClass();
                        if (x7.w6.a(objArr[f10], entry.getValue())) {
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
                Map b10 = iVar.b();
                return b10 != null ? b10.entrySet().iterator() : new f(iVar, 1);
            default:
                i iVar2 = this.b;
                Map b11 = iVar2.b();
                return b11 != null ? b11.keySet().iterator() : new f(iVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                Map b10 = iVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!iVar.d()) {
                        int e10 = iVar.e();
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
                        int a10 = x7.s6.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            iVar.c(a10, e10);
                            iVar.f--;
                            iVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                i iVar2 = this.b;
                Map b11 = iVar2.b();
                return b11 != null ? b11.keySet().remove(obj) : iVar2.h(obj) != i.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
