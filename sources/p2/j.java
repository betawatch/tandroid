package p2;

import a8.p0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public j(long j3, String str, long j10) {
        this.c = str == null ? "" : str;
        this.a = j3;
        this.b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.c);
        if (jVar != null) {
            long j3 = jVar.b;
            if (f10.equals(h2.e.f(str, jVar.c))) {
                long j10 = this.b;
                if (j10 != -1) {
                    long j11 = this.a;
                    jVar2 = null;
                    if (j11 + j10 == jVar.a) {
                        return new j(j11, f10, j3 != -1 ? j10 + j3 : -1L);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 == -1) {
                    return jVar2;
                }
                long j12 = jVar.a;
                if (j12 + j3 == this.a) {
                    return new j(j12, f10, j10 != -1 ? j3 + j10 : -1L);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c.equals(jVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.c);
        sb2.append(", start=");
        sb2.append(this.a);
        sb2.append(", length=");
        return p0.r(sb2, this.b, ")");
    }
}
