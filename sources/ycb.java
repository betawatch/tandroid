// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ycb implements d06, Serializable {
    public op4 a;
    public volatile Object b;
    public final Object c;

    public ycb(op4 op4Var) {
        op4Var.getClass();
        this.a = op4Var;
        this.b = pd5.d;
        this.c = this;
    }

    @Override // d06
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        pd5 pd5Var = pd5.d;
        if (obj2 != pd5Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == pd5Var) {
                op4 op4Var = this.a;
                op4Var.getClass();
                obj = op4Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.b != pd5.d ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
