// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zo3 implements lt8 {
    public static final Object c = new Object();
    public volatile lt8 a;
    public volatile Object b;

    public static lt8 a(lt8 lt8Var) {
        if (lt8Var instanceof zo3) {
            return lt8Var;
        }
        zo3 zo3Var = new zo3();
        zo3Var.b = c;
        zo3Var.a = lt8Var;
        return zo3Var;
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
