package q7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q extends o {
    public final /* synthetic */ r d;

    public q(r rVar) {
        this.d = rVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // q7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a.b(this.d.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // q7.h
    public final d0 k() {
        return o().listIterator(0);
    }

    @Override // q7.o
    public final m p() {
        return new p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.d.size();
    }
}
