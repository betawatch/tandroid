// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r1d implements v1d {
    public static final Object c = new Object();
    public volatile s1d a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static r1d b(s1d s1dVar) {
        if (s1dVar instanceof r1d) {
            return (r1d) s1dVar;
        }
        r1d r1dVar = new r1d();
        r1dVar.b = c;
        r1dVar.a = s1dVar;
        return r1dVar;
    }

    @Override // w1d
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.a();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
