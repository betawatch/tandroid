// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yo3 implements kt8 {
    public static final Object c = new Object();
    public volatile kt8 a;
    public volatile Object b;

    public static kt8 a(kt8 kt8Var) {
        if (kt8Var instanceof yo3) {
            return kt8Var;
        }
        yo3 yo3Var = new yo3();
        yo3Var.b = c;
        yo3Var.a = kt8Var;
        return yo3Var;
    }

    @Override // lt8
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
