// default package

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uo5 extends v9c {
    public final v9c b;
    public Object c;
    public v9c d;

    public uo5(qo5 qo5Var) {
        super((byte) 0);
        o99 o99Var = qo5Var.e;
        bp5 bp5Var = o99Var.a;
        if (bp5Var == null) {
            bp5Var = o99Var.c();
            o99Var.a = bp5Var;
        }
        this.b = bp5Var.iterator();
        this.c = null;
        this.d = ou5.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext() || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            this.d = ((jo5) entry.getValue()).iterator();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new ko5(obj, this.d.next());
    }
}
