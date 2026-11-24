// default package

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class po2 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ so2 b;

    public /* synthetic */ po2(so2 so2Var, byte b) {
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
                Map d = so2Var.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = so2Var.f(entry.getKey());
                    if (f != -1 && bqe.a(so2Var.l(f), entry.getValue())) {
                        return true;
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
                Map d = so2Var.d();
                return d != null ? d.entrySet().iterator() : new oo2(so2Var, (byte) 1);
            default:
                Map d2 = so2Var.d();
                return d2 != null ? d2.keySet().iterator() : new oo2(so2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        so2 so2Var = this.b;
        switch (b) {
            case 0:
                Map d = so2Var.d();
                if (d == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!so2Var.i()) {
                            int e = so2Var.e();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = so2Var.b;
                            Objects.requireNonNull(obj2);
                            int[] iArr = so2Var.c;
                            Objects.requireNonNull(iArr);
                            Object[] objArr = so2Var.d;
                            Objects.requireNonNull(objArr);
                            Object[] objArr2 = so2Var.e;
                            Objects.requireNonNull(objArr2);
                            int c = dsd.c(key, value, e, obj2, iArr, objArr, objArr2);
                            if (c != -1) {
                                so2Var.h(c, e);
                                so2Var.h--;
                                so2Var.f += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map d2 = so2Var.d();
                if (d2 == null) {
                    if (so2Var.j(obj) != so2.w) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
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
