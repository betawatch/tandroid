// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r22 {
    public final int a;
    public final long b;

    public r22(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static r22 a(Object obj) {
        if (obj instanceof iv2) {
            return new r22(2, ((iv2) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new r22(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r22.class != obj.getClass()) {
            return false;
        }
        r22 r22Var = (r22) obj;
        return this.b == r22Var.b && this.a == r22Var.a;
    }

    public final int hashCode() {
        return Objects.hash(ik8.b(this.a), Long.valueOf(this.b));
    }
}
