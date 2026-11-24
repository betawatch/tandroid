// default package

import java.lang.reflect.Method;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qh2 {
    public final byte a;
    public final Method b;

    /* JADX WARN: Multi-variable type inference failed */
    public qh2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return false;
        }
        qh2 qh2Var = (qh2) obj;
        return this.a == qh2Var.a && this.b.getName().equals(qh2Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
