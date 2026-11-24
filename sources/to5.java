// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class to5 extends v7c {
    public int b;
    public Object c;
    public final /* synthetic */ v7c d;

    public to5(v7c v7cVar) {
        super((byte) 0);
        this.d = v7cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0 || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i <= 0) {
            yp7 yp7Var = (yp7) this.d.next();
            this.c = yp7Var.a;
            i = yp7Var.a();
            this.b = i;
        }
        this.b = i - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
