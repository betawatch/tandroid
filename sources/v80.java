// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v80 {
    public final int a;
    public final long b;

    public v80(int i, long j) {
        if (i == 0) {
            gxc.d("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj;
        return wi8.c(this.a, v80Var.a) && this.b == v80Var.b;
    }

    public final int hashCode() {
        int F = (wi8.F(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return F ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return kt6.q(sb, this.b, "}");
    }
}
