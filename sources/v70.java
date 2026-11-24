// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v70 {
    public final int a;
    public final long b;

    public v70(int i, long j) {
        if (i == 0) {
            fvc.f("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return ug8.c(this.a, v70Var.a) && this.b == v70Var.b;
    }

    public final int hashCode() {
        int F = (ug8.F(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return F ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return ls6.p(sb, this.b, "}");
    }
}
