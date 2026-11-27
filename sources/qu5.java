// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qu5 extends v9c {
    public final Object b;
    public boolean c;

    public qu5(Object obj) {
        super((byte) 0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            lq5.n();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
