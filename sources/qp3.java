// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qp3 implements uw8 {
    public static final Object c = new Object();
    public volatile uw8 a;
    public volatile Object b;

    public static uw8 a(uw8 uw8Var) {
        if (uw8Var instanceof qp3) {
            return uw8Var;
        }
        qp3 qp3Var = new qp3();
        qp3Var.b = c;
        qp3Var.a = uw8Var;
        return qp3Var;
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
