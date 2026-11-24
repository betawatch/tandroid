// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rbb implements qbb, Serializable {
    public final transient Object a = new Object();
    public final qbb b;
    public volatile transient boolean c;
    public transient Object d;

    public rbb(qbb qbbVar) {
        this.b = qbbVar;
    }

    @Override // qbb
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    Object obj = this.b.get();
                    this.d = obj;
                    this.c = true;
                    return obj;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
