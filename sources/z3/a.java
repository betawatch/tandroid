package z3;

import f9.i0;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a {
    public final i0 a;
    public final long b;
    public final long c;
    public final long d;

    public a(long j10, long j11, List list) {
        this.a = i0.u(list);
        this.b = j10;
        this.c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.d = j12;
    }
}
