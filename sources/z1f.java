// default package

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z1f extends p9a {
    public final /* synthetic */ byte b = 0;
    public final AbstractMap c;

    public z1f(wjf wjfVar, dq2 dq2Var) {
        super((byte) 1);
        dq2Var.getClass();
        this.c = dq2Var;
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
                    i9f i9fVar = (i9f) it;
                    if (!i9fVar.hasNext()) {
                        break;
                    } else {
                        i9fVar.next();
                        i9fVar.remove();
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
                    return ((dq2) ((d3) abstractMap).d).entrySet().contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return ((dq2) abstractMap).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return ((dq2) this.c).keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                return this == obj || ((dq2) this.c).keySet().equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.b) {
            case 1:
                return ((dq2) this.c).keySet().hashCode();
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
                return ((dq2) abstractMap).isEmpty();
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
                return new i9f(this, ((dq2) abstractMap).entrySet().iterator());
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
                    dq2 dq2Var = ((wjf) ((d3) abstractMap).e).c;
                    dq2Var.getClass();
                    try {
                        obj2 = dq2Var.remove(key);
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
                Collection collection2 = (Collection) ((dq2) abstractMap).remove(obj);
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

    @Override // p9a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return p2f.a(this, collection);
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

    @Override // p9a, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                            u36.j(hg9.j(size, "expectedSize cannot be negative but was: "));
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
                    wjf wjfVar = (wjf) ((d3) this.c).e;
                    z1f z1fVar = wjfVar.a;
                    if (z1fVar == null) {
                        z1fVar = new z1f(wjfVar, wjfVar.c);
                        wjfVar.a = z1fVar;
                    }
                    return z1fVar.retainAll(hashSet);
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
                return ((dq2) ((d3) abstractMap).d).size();
            default:
                return ((dq2) abstractMap).size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1f(d3 d3Var) {
        super((byte) 1);
        this.c = d3Var;
    }
}
