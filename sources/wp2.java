// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wp2 {
    public final Object a;
    public final ra1 b;
    public final ks4 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ wp2(Object obj, ra1 ra1Var, ks4 ks4Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : ra1Var, (i & 4) != 0 ? null : ks4Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static wp2 a(wp2 wp2Var, ra1 ra1Var, CancellationException cancellationException, int i) {
        Object obj = wp2Var.a;
        if ((i & 2) != 0) {
            ra1Var = wp2Var.b;
        }
        ra1 ra1Var2 = ra1Var;
        ks4 ks4Var = wp2Var.c;
        Object obj2 = wp2Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = wp2Var.e;
        }
        return new wp2(obj, ra1Var2, ks4Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp2)) {
            return false;
        }
        wp2 wp2Var = (wp2) obj;
        return ur5.a(this.a, wp2Var.a) && ur5.a(this.b, wp2Var.b) && ur5.a(this.c, wp2Var.c) && ur5.a(this.d, wp2Var.d) && ur5.a(this.e, wp2Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ra1 ra1Var = this.b;
        int hashCode2 = (hashCode + (ra1Var == null ? 0 : ra1Var.hashCode())) * 31;
        ks4 ks4Var = this.c;
        int hashCode3 = (hashCode2 + (ks4Var == null ? 0 : ks4Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public wp2(Object obj, ra1 ra1Var, ks4 ks4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ra1Var;
        this.c = ks4Var;
        this.d = obj2;
        this.e = th;
    }
}
