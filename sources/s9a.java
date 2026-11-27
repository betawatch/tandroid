// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s9a {
    public static final r9a Companion = new r9a();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ s9a(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            sve.a(i, 15, q9a.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9a)) {
            return false;
        }
        s9a s9aVar = (s9a) obj;
        return ur5.a(this.a, s9aVar.a) && ur5.a(this.b, s9aVar.b) && this.c == s9aVar.c && this.d == s9aVar.d;
    }

    public final int hashCode() {
        int j = (bs2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j2 = this.d;
        return j + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public s9a(long j, String str, String str2, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
