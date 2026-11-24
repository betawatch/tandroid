// default package

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u8d extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ so2 b;

    public /* synthetic */ u8d(so2 so2Var, byte b) {
        this.a = b;
        this.b = so2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                so2Var.clear();
                break;
            default:
                so2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map n = so2Var.n();
                if (n != null) {
                    return n.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int x = so2Var.x(entry.getKey());
                    if (x != -1) {
                        Object[] objArr = so2Var.e;
                        objArr.getClass();
                        if (s3f.a(objArr[x], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return so2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map n = so2Var.n();
                return n != null ? n.entrySet().iterator() : new j8d(so2Var, (byte) 1);
            default:
                Map n2 = so2Var.n();
                return n2 != null ? n2.keySet().iterator() : new j8d(so2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map n = so2Var.n();
                if (n == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!so2Var.t()) {
                            int w = so2Var.w();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = so2Var.b;
                            obj2.getClass();
                            int[] iArr = so2Var.c;
                            iArr.getClass();
                            Object[] objArr = so2Var.d;
                            objArr.getClass();
                            Object[] objArr2 = so2Var.e;
                            objArr2.getClass();
                            int a = nze.a(key, value, w, obj2, iArr, objArr, objArr2);
                            if (a != -1) {
                                so2Var.r(a, w);
                                so2Var.h--;
                                so2Var.f += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map n2 = so2Var.n();
                if (n2 == null) {
                    if (so2Var.z(obj) == so2.y) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
        }
        return so2Var.size();
    }
}
