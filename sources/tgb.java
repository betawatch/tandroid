// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tgb implements h26, Serializable {
    public sr4 a;
    public volatile Object b;
    public final Object c;

    public tgb(sr4 sr4Var) {
        sr4Var.getClass();
        this.a = sr4Var;
        this.b = qf5.d;
        this.c = this;
    }

    @Override // h26
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        qf5 qf5Var = qf5.d;
        if (obj2 != qf5Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == qf5Var) {
                sr4 sr4Var = this.a;
                sr4Var.getClass();
                obj = sr4Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.b != qf5.d ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
