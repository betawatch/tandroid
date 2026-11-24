// default package

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pa0 {
    public final String a;
    public final Integer b;
    public final z34 c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public pa0(String str, Integer num, z34 z34Var, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = z34Var;
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

    public final oa0 c() {
        oa0 oa0Var = new oa0();
        String str = this.a;
        if (str == null) {
            gxc.d("Null transportName");
            return null;
        }
        oa0Var.a = str;
        oa0Var.c = this.b;
        oa0Var.d = this.g;
        oa0Var.b = this.h;
        oa0Var.i = this.i;
        oa0Var.j = this.j;
        z34 z34Var = this.c;
        if (z34Var == null) {
            gxc.d("Null encodedPayload");
            return null;
        }
        oa0Var.e = z34Var;
        oa0Var.f = Long.valueOf(this.d);
        oa0Var.g = Long.valueOf(this.e);
        oa0Var.h = new HashMap(this.f);
        return oa0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0Var = (pa0) obj;
        if (!this.a.equals(pa0Var.a)) {
            return false;
        }
        Integer num = pa0Var.b;
        Integer num2 = this.b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.c.equals(pa0Var.c) || this.d != pa0Var.d || this.e != pa0Var.e || !this.f.equals(pa0Var.f)) {
            return false;
        }
        Integer num3 = pa0Var.g;
        Integer num4 = this.g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = pa0Var.h;
        String str2 = this.h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.i, pa0Var.i) && Arrays.equals(this.j, pa0Var.j);
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
