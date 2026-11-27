// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x70 {
    public final int a;
    public final long b;

    public x70(int i, long j) {
        if (i == 0) {
            p3d.h("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x70)) {
            return false;
        }
        x70 x70Var = (x70) obj;
        return ik8.c(this.a, x70Var.a) && this.b == x70Var.b;
    }

    public final int hashCode() {
        int F = (ik8.F(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return F ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return qu6.p(sb, this.b, "}");
    }
}
