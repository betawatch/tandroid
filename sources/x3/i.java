package x3;

import c3.l0;
import c3.s;
import e2.x;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class i {
    public l0 b;
    public s c;
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
    public n2.e j = new n2.e(23, false);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(x xVar);

    public abstract boolean c(x xVar, long j10, n2.e eVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new n2.e(23, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
