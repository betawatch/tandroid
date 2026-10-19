package w7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.j0 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public wa(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.c = j0Var;
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

    @Override // w7.k9
    public final int h(Object[] objArr) {
        sa saVar = this.b;
        if (saVar == null) {
            saVar = new va(this);
            this.b = saVar;
        }
        return saVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        sa saVar = this.b;
        if (saVar == null) {
            saVar = new va(this);
            this.b = saVar;
        }
        return saVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
