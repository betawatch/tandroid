package x3;

import c3.i0;
import c3.q;
import e2.x;
import n6.o;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
    public o j = new o(22, false);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(x xVar);

    public abstract boolean c(x xVar, long j10, o oVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new o(22, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
