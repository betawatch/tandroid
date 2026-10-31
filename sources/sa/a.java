package sa;

import a1.g;
import kg.s0;
import m1.j;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.a = str;
        this.b = i10;
        this.c = str2;
        this.d = str3;
        this.e = j10;
        this.f = j11;
        this.g = str4;
    }

    public final s0 a() {
        s0 s0Var = new s0(3);
        s0Var.c = this.a;
        s0Var.b = this.b;
        s0Var.d = this.c;
        s0Var.e = this.d;
        s0Var.f = Long.valueOf(this.e);
        s0Var.g = Long.valueOf(this.f);
        s0Var.h = this.g;
        return s0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.g;
        String str2 = aVar.d;
        String str3 = aVar.c;
        String str4 = aVar.a;
        String str5 = this.a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!j.b(this.b, aVar.b)) {
            return false;
        }
        String str6 = this.c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.e != aVar.e || this.f != aVar.f) {
            return false;
        }
        String str8 = this.g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ j.c(this.b)) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.e;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.a);
        sb2.append(", registrationStatus=");
        int i10 = this.b;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f);
        sb2.append(", fisError=");
        return g.r(sb2, this.g, "}");
    }
}
