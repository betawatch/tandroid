// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ydb extends IllegalStateException {
    public final byte a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ydb(int i, int i2) {
        super(r0);
        String n;
        if (i == 0) {
            n = qd4.n(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            n = qd4.n(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            n = qd4.n(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            n = qd4.n(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                grb.g();
                throw null;
            }
            n = qd4.n(i2, "Player stuck suppressed for ", " ms");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ydb.class != obj.getClass()) {
            return false;
        }
        ydb ydbVar = (ydb) obj;
        return this.a == ydbVar.a && this.b == ydbVar.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
