package z9;

import aa.d;
import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public a(String str, int i9, String str2, String str3, long j10, long j11, String str4) {
        this.a = str;
        this.b = i9;
        this.c = str2;
        this.d = str3;
        this.e = j10;
        this.f = j11;
        this.g = str4;
    }

    public final f2.b a() {
        f2.b bVar = new f2.b(1);
        bVar.c = this.a;
        bVar.b = this.b;
        bVar.d = this.c;
        bVar.e = this.d;
        bVar.f = Long.valueOf(this.e);
        bVar.g = Long.valueOf(this.f);
        bVar.h = this.g;
        return bVar;
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
        if (!j.a(this.b, aVar.b)) {
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
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ j.b(this.b)) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.e;
        int i9 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f;
        int i10 = (i9 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.a);
        sb2.append(", registrationStatus=");
        int i9 = this.b;
        sb2.append(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? BuildConfig.BETA_URL : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f);
        sb2.append(", fisError=");
        return d.r(sb2, this.g, "}");
    }
}
