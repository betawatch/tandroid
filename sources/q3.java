// default package

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q3 extends AbstractCollection {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ q3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r3) obj).b();
                break;
            case 1:
                ((gj7) obj).b();
                break;
            case 2:
                ((lp2) obj).clear();
                break;
            case 3:
                ((AbstractMap) obj).clear();
                break;
            case 4:
                ((lp2) obj).clear();
                break;
            case 5:
                ((lp2) obj).clear();
                break;
            case 6:
                ((e3) obj).clear();
                break;
            default:
                ((e3) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((r3) obj2).a().get(key);
                return collection != null && collection.contains(value);
            case 1:
                return ((gj7) obj2).c(obj);
            case 2:
            case 4:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) obj2).containsValue(obj);
            case 6:
                return ((e3) obj2).containsValue(obj);
            case 7:
                return ((e3) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 3:
                return ((AbstractMap) this.b).isEmpty();
            case 4:
            case 5:
            default:
                return super.isEmpty();
            case 6:
                return ((e3) this.b).isEmpty();
            case 7:
                return ((e3) this.b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((r3) obj).h();
            case 1:
                return new b3((gj7) obj, (byte) 0);
            case 2:
                lp2 lp2Var = (lp2) obj;
                Map d = lp2Var.d();
                return d != null ? d.values().iterator() : new hp2(lp2Var, b2);
            case 3:
                return new qk6(((AbstractMap) obj).entrySet().iterator());
            case 4:
                lp2 lp2Var2 = (lp2) obj;
                Map m = lp2Var2.m();
                return m != null ? m.values().iterator() : new mad(lp2Var2, b2);
            case 5:
                lp2 lp2Var3 = (lp2) obj;
                Map n = lp2Var3.n();
                return n != null ? n.values().iterator() : new cdd(lp2Var3, b2);
            case 6:
                return new wgd(((e3) obj).entrySet().iterator(), (byte) 0);
            default:
                return new wgd(((e3) obj).entrySet().iterator(), (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((r3) obj2).k(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (tue.a(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                e3 e3Var = (e3) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : e3Var.entrySet()) {
                        if (e6f.a(obj, entry3.getValue())) {
                            e3Var.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                e3 e3Var2 = (e3) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : e3Var2.entrySet()) {
                        if (l8f.a(obj, entry4.getValue())) {
                            e3Var2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 4:
            case 5:
            default:
                return super.removeAll(collection);
            case 6:
                e3 e3Var = (e3) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : e3Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lmf) e3Var.e).b().removeAll(hashSet2);
                }
            case 7:
                e3 e3Var2 = (e3) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : e3Var2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((ccd) e3Var2.e).b().removeAll(hashSet3);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 4:
            case 5:
            default:
                return super.retainAll(collection);
            case 6:
                e3 e3Var = (e3) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : e3Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lmf) e3Var.e).b().retainAll(hashSet2);
                }
            case 7:
                e3 e3Var2 = (e3) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : e3Var2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((ccd) e3Var2.e).b().retainAll(hashSet3);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
        }
        return ((e3) obj).size();
    }

    public /* synthetic */ q3(AbstractMap abstractMap, byte b) {
        this.a = b;
        this.b = abstractMap;
    }
}
