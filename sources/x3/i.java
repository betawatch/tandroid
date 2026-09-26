package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class i {
    public h0 b;
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
    public z0 j = new z0(25);

    public void a(long j3) {
        this.g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.j = new z0(25);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
