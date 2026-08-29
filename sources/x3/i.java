package x3;

import o3.m;
import o3.w;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i {
    public w b;
    public m c;
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
    public n j = new n();

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(f5.w wVar);

    public abstract boolean c(f5.w wVar, long j10, n nVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new n();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
