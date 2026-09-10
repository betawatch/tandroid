package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.a1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public a1 j = new a1(25, (byte) 0);

    public void a(long j3) {
        this.g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, a1 a1Var);

    public void d(boolean z10) {
        if (z10) {
            this.j = new a1(25, (byte) 0);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
