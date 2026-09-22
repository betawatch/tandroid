package z3;

import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a {
    public final i0 a;
    public final long b;
    public final long c;
    public final long d;

    public a(long j3, long j10, List list) {
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
