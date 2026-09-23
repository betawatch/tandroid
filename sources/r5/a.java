package r5;

import java.util.HashMap;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class a {
    public final u5.a a;
    public final HashMap b;

    public a(u5.a aVar, HashMap hashMap) {
        this.a = aVar;
        this.b = hashMap;
    }

    public final long a(i5.d dVar, long j3, int i10) {
        long q6 = j3 - this.a.q();
        b bVar = (b) this.b.get(dVar);
        long j10 = bVar.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r12))), q6), bVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
