package pa;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ j(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        k a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        a2 = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        kVar = a2;
                    }
                    return kVar == null;
                }
                a2 = null;
                if (a2 != null) {
                    kVar = a2;
                }
                if (kVar == null) {
                }
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new i(this.b, 0);
            default:
                return new i(this.b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        k a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                l lVar = this.b;
                k kVar = null;
                if (key != null) {
                    try {
                        a2 = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        kVar = a2;
                    }
                    if (kVar != null) {
                        return false;
                    }
                    lVar.c(kVar, true);
                    return true;
                }
                a2 = null;
                if (a2 != null) {
                    kVar = a2;
                }
                if (kVar != null) {
                }
            default:
                l lVar2 = this.b;
                k kVar2 = null;
                if (obj != null) {
                    try {
                        kVar2 = lVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVar2 != null) {
                    lVar2.c(kVar2, true);
                }
                return kVar2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
