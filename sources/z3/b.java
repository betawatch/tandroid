package z3;

import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b {
    public final i0 a;
    public final long b;
    public final long c;
    public final long d;

    public b(long j3, long j10, List list) {
        this.a = i0.v(list);
        this.b = j3;
        this.c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
