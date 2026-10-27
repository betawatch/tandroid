package s5;

import java.util.HashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public final v5.a a;
    public final HashMap b;

    public a(v5.a aVar, HashMap hashMap) {
        this.a = aVar;
        this.b = hashMap;
    }

    public final long a(j5.d dVar, long j10, int i10) {
        long o10 = j10 - this.a.o();
        b bVar = (b) this.b.get(dVar);
        long j11 = bVar.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * r12))), o10), bVar.b);
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
