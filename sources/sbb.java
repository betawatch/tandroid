// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sbb implements qbb {
    public static final k40 d = new k40(7);
    public final Object a = new Object();
    public volatile qbb b;
    public Object c;

    public sbb(qbb qbbVar) {
        this.b = qbbVar;
    }

    @Override // qbb
    public final Object get() {
        qbb qbbVar = this.b;
        k40 k40Var = d;
        if (qbbVar != k40Var) {
            synchronized (this.a) {
                if (this.b != k40Var) {
                    Object obj = this.b.get();
                    this.c = obj;
                    this.b = k40Var;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
