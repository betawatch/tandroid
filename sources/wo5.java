// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
