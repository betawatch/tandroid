// default package

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xif extends p9a {
    public final /* synthetic */ d3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xif(d3 d3Var) {
        super((byte) 2);
        this.b = d3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        try {
            return ((dq2) this.b.d).entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c3(this.b, (char) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        l9d l9dVar = (l9d) this.b.e;
        Object key = entry.getKey();
        dq2 dq2Var = l9dVar.c;
        dq2Var.getClass();
        try {
            obj2 = dq2Var.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        l9dVar.d -= size;
        return true;
    }

    @Override // p9a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return v2f.a(this, collection);
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
    }

    @Override // p9a, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
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
            l9d l9dVar = (l9d) this.b.e;
            f7d f7dVar = l9dVar.a;
            if (f7dVar == null) {
                f7dVar = new f7d(l9dVar, l9dVar.c);
                l9dVar.a = f7dVar;
            }
            return f7dVar.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((dq2) this.b.d).size();
    }
}
