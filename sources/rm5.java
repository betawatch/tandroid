// default package

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rm5 extends v5c {
    public final v5c b;
    public Object c;
    public v5c d;

    public rm5(nm5 nm5Var) {
        super((byte) 0);
        b69 b69Var = nm5Var.e;
        ym5 ym5Var = b69Var.a;
        if (ym5Var == null) {
            ym5Var = b69Var.c();
            b69Var.a = ym5Var;
        }
        this.b = ym5Var.iterator();
        this.c = null;
        this.d = ls5.e;
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
            this.d = ((gm5) entry.getValue()).iterator();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new hm5(obj, this.d.next());
    }
}
