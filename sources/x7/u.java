package x7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class u extends p {
    public final transient com.google.android.gms.internal.cast.l0 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public u(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.c = l0Var;
        this.d = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.k
    public final int i(Object[] objArr) {
        o oVar = this.b;
        if (oVar == null) {
            oVar = new t(this);
            this.b = oVar;
        }
        return oVar.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        o oVar = this.b;
        if (oVar == null) {
            oVar = new t(this);
            this.b = oVar;
        }
        return oVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
