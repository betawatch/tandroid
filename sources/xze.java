// default package

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xze extends o7a {
    public final /* synthetic */ byte b = 0;
    public final AbstractMap c;

    public xze(vhf vhfVar, so2 so2Var) {
        super((byte) 1);
        so2Var.getClass();
        this.c = so2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.b) {
            case 0:
                ((d3) this.c).clear();
                break;
            default:
                Iterator it = iterator();
                while (true) {
                    g7f g7fVar = (g7f) it;
                    if (!g7fVar.hasNext()) {
                        break;
                    } else {
                        g7fVar.next();
                        g7fVar.remove();
                    }
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                try {
                    return ((so2) ((d3) abstractMap).d).entrySet().contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return ((so2) abstractMap).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return ((so2) this.c).keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                return this == obj || ((so2) this.c).keySet().equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.b) {
            case 1:
                return ((so2) this.c).keySet().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return ((d3) abstractMap).isEmpty();
            default:
                return ((so2) abstractMap).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return new c3((d3) abstractMap, (byte) 0);
            default:
                return new g7f(this, ((so2) abstractMap).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    Object key = entry.getKey();
                    so2 so2Var = ((vhf) ((d3) abstractMap).e).c;
                    so2Var.getClass();
                    try {
                        obj2 = so2Var.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        obj2 = null;
                    }
                    Collection collection = (Collection) obj2;
                    if (collection != null) {
                        collection.size();
                        collection.clear();
                    }
                    break;
                }
                break;
            default:
                Collection collection2 = (Collection) ((so2) abstractMap).remove(obj);
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    if (size > 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // o7a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return n0f.a(this, collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    Iterator it = collection.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        z |= remove(it.next());
                    }
                    return z;
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // o7a, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    int size = collection.size();
                    if (size >= 3) {
                        ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    } else {
                        if (size < 0) {
                            w26.j(de9.k(size, "expectedSize cannot be negative but was: "));
                            return false;
                        }
                        ceil = size + 1;
                    }
                    HashSet hashSet = new HashSet(ceil);
                    for (Object obj : collection) {
                        if (contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    vhf vhfVar = (vhf) ((d3) this.c).e;
                    xze xzeVar = vhfVar.a;
                    if (xzeVar == null) {
                        xzeVar = new xze(vhfVar, vhfVar.c);
                        vhfVar.a = xzeVar;
                    }
                    return xzeVar.retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return ((so2) ((d3) abstractMap).d).size();
            default:
                return ((so2) abstractMap).size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xze(d3 d3Var) {
        super((byte) 1);
        this.c = d3Var;
    }
}
