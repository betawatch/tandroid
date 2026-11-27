// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pp3 implements tw8 {
    public static final Object c = new Object();
    public volatile tw8 a;
    public volatile Object b;

    public static tw8 a(tw8 tw8Var) {
        if (tw8Var instanceof pp3) {
            return tw8Var;
        }
        pp3 pp3Var = new pp3();
        pp3Var.b = c;
        pp3Var.a = tw8Var;
        return pp3Var;
    }

    @Override // uw8
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
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
