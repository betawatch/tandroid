// default package

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rs9 implements h26, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(rs9.class, Object.class, "b");
    public volatile sr4 a;
    public volatile Object b;

    @Override // h26
    public final Object getValue() {
        Object obj = this.b;
        qf5 qf5Var = qf5.d;
        if (obj != qf5Var) {
            return obj;
        }
        sr4 sr4Var = this.a;
        if (sr4Var != null) {
            Object invoke = sr4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qf5Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != qf5Var) {
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != qf5.d ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
