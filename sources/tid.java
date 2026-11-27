// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tid extends ofd {
    public final transient ybd h;
    public final transient Object[] n;
    public final transient boolean r;

    public tid(ybd ybdVar, Object[] objArr) {
        super((byte) 0);
        this.h = ybdVar;
        this.n = objArr;
        this.r = true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // qdd
    public final int h(Object[] objArr) {
        ted tedVar = this.f;
        if (tedVar == null) {
            tedVar = new oid(this);
            this.f = tedVar;
        }
        return tedVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ted tedVar = this.f;
        if (tedVar == null) {
            tedVar = new oid(this);
            this.f = tedVar;
        }
        return tedVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
