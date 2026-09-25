package za;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class l0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final j e;
    public final String f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i10;
        this.d = j3;
        this.e = jVar;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.i.a(this.a, l0Var.a) && kotlin.jvm.internal.i.a(this.b, l0Var.b) && this.c == l0Var.c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f, l0Var.f);
    }

    public final int hashCode() {
        int h = (a4.a.h(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j3 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((h + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ')';
    }
}
