package y9;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class o0 extends n1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.a = j3;
        this.b = j10;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            o0 o0Var = (o0) ((n1) obj);
            String str2 = o0Var.d;
            if (this.a == o0Var.a && this.b == o0Var.b && this.c.equals(o0Var.c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.b;
        int hashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.a);
        sb2.append(", size=");
        sb2.append(this.b);
        sb2.append(", name=");
        sb2.append(this.c);
        sb2.append(", uuid=");
        return a4.a.s(sb2, this.d, "}");
    }
}
