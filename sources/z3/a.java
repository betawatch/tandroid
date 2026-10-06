package z3;

import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
