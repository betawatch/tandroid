// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vgf extends tcf {
    public final transient f7d h;
    public final transient Object[] n;
    public final transient boolean r;

    public vgf(f7d f7dVar, Object[] objArr) {
        super((byte) 2);
        this.h = f7dVar;
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

    @Override // x8d
    public final int h(Object[] objArr) {
        f7f f7fVar = this.f;
        if (f7fVar == null) {
            f7fVar = new jgf(this);
            this.f = f7fVar;
        }
        return f7fVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f7f f7fVar = this.f;
        if (f7fVar == null) {
            f7fVar = new jgf(this);
            this.f = f7fVar;
        }
        return f7fVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
