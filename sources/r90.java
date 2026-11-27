// default package

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r90 {
    public final String a;
    public final Integer b;
    public final j34 c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public r90(String str, Integer num, j34 j34Var, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = j34Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final q90 c() {
        q90 q90Var = new q90();
        String str = this.a;
        if (str == null) {
            p3d.h("Null transportName");
            return null;
        }
        q90Var.a = str;
        q90Var.c = this.b;
        q90Var.d = this.g;
        q90Var.b = this.h;
        q90Var.i = this.i;
        q90Var.j = this.j;
        j34 j34Var = this.c;
        if (j34Var == null) {
            p3d.h("Null encodedPayload");
            return null;
        }
        q90Var.e = j34Var;
        q90Var.f = Long.valueOf(this.d);
        q90Var.g = Long.valueOf(this.e);
        q90Var.h = new HashMap(this.f);
        return q90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        if (!this.a.equals(r90Var.a)) {
            return false;
        }
        Integer num = r90Var.b;
        Integer num2 = this.b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.c.equals(r90Var.c) || this.d != r90Var.d || this.e != r90Var.e || !this.f.equals(r90Var.f)) {
            return false;
        }
        Integer num3 = r90Var.g;
        Integer num4 = this.g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = r90Var.h;
        String str2 = this.h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.i, r90Var.i) && Arrays.equals(this.j, r90Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
