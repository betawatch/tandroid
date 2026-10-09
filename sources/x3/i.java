package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.t;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public t j = new t(26);

    public void a(long j3) {
        this.g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, t tVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new t(26);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
