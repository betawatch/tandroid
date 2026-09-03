package x2;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends r {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final v g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.a = j10;
        this.b = num;
        this.c = j11;
        this.d = bArr;
        this.e = str;
        this.f = j12;
        this.g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.g;
            String str2 = kVar.e;
            Integer num2 = kVar.b;
            if (this.a == kVar.a && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c == kVar.c) {
                if (Arrays.equals(this.d, rVar instanceof k ? ((k) rVar).d : kVar.d) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f == kVar.f && ((vVar = this.g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.c;
        int hashCode2 = (((hashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f;
        int i11 = (hashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.g;
        return i11 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
