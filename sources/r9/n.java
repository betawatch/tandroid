package r9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements qa.b {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile qa.b b;

    public n(qa.b bVar) {
        this.b = bVar;
    }

    @Override // qa.b
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
