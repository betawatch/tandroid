package t7;

import com.google.android.gms.internal.cast.l0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class i extends f {
    public final transient l0 c;
    public final transient Object[] d;
    public final transient int e;

    public i(l0 l0Var, Object[] objArr, int i10) {
        this.c = l0Var;
        this.d = objArr;
        this.e = i10;
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

    @Override // t7.a
    public final int i(Object[] objArr) {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
