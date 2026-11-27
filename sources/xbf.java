// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xbf implements Iterator {
    public Map.Entry a;
    public final /* synthetic */ Iterator b;

    public xbf(o4f o4fVar, Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.a;
        if (!(entry != null)) {
            grb.i("no calls to next() since the last call to remove()");
            return;
        }
        Collection collection = (Collection) entry.getValue();
        this.b.remove();
        collection.size();
        collection.clear();
        this.a = null;
    }
}
