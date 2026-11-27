// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wo5 extends v9c {
    public int b;
    public Object c;
    public final /* synthetic */ v9c d;

    public wo5(v9c v9cVar) {
        super((byte) 0);
        this.d = v9cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0 || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i <= 0) {
            vq7 vq7Var = (vq7) this.d.next();
            this.c = vq7Var.a;
            i = vq7Var.a();
            this.b = i;
        }
        this.b = i - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
