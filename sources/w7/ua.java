package w7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ua extends ra {
    public final transient com.google.android.gms.internal.cast.i0 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public ua(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.c = i0Var;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        qa qaVar = this.b;
        if (qaVar == null) {
            qaVar = new ta(this);
            this.b = qaVar;
        }
        return qaVar.listIterator(0);
    }

    @Override // w7.i9
    public final int l(Object[] objArr) {
        qa qaVar = this.b;
        if (qaVar == null) {
            qaVar = new ta(this);
            this.b = qaVar;
        }
        return qaVar.l(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
