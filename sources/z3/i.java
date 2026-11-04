package z3;

import e3.i0;
import e3.q;
import g2.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i {
    public i0 b;
    public q c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final e a = new e();
    public ua.b j = new ua.b(7);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(y yVar);

    public abstract boolean c(y yVar, long j10, ua.b bVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new ua.b(7);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
