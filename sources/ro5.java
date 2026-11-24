// default package

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ro5 extends v7c {
    public final v7c b;
    public Object c;
    public v7c d;

    public ro5(no5 no5Var) {
        super((byte) 0);
        d89 d89Var = no5Var.e;
        yo5 yo5Var = d89Var.a;
        if (yo5Var == null) {
            yo5Var = d89Var.c();
            d89Var.a = yo5Var;
        }
        this.b = yo5Var.iterator();
        this.c = null;
        this.d = ku5.e;
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
            this.d = ((go5) entry.getValue()).iterator();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new ho5(obj, this.d.next());
    }
}
