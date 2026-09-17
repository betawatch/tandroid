package za;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class j0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final j e;
    public final String f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
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
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.i.a(this.a, j0Var.a) && kotlin.jvm.internal.i.a(this.b, j0Var.b) && this.c == j0Var.c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f, j0Var.f);
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
