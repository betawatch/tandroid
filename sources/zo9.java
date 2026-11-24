// default package

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zo9 implements d06, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(zo9.class, Object.class, "b");
    public volatile op4 a;
    public volatile Object b;

    @Override // d06
    public final Object getValue() {
        Object obj = this.b;
        pd5 pd5Var = pd5.d;
        if (obj != pd5Var) {
            return obj;
        }
        op4 op4Var = this.a;
        if (op4Var != null) {
            Object invoke = op4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pd5Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != pd5Var) {
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != pd5.d ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
