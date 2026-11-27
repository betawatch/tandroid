// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wnd extends dnd {
    public final /* synthetic */ eod s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnd(eod eodVar) {
        super((byte) 4);
        this.s = eodVar;
    }

    @Override // dnd
    public final omd B() {
        return new qnd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.s.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // dnd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return t5f.a(this.s.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.d.size();
    }

    @Override // b4d
    public final v9c u() {
        return A().listIterator(0);
    }
}
