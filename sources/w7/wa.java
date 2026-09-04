package w7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.l0 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public wa(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
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

    @Override // w7.k9
    public final int i(Object[] objArr) {
        sa saVar = this.b;
        if (saVar == null) {
            saVar = new va(this);
            this.b = saVar;
        }
        return saVar.i(objArr);
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
