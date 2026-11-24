// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tf2 implements fm6 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public final void a(long j) {
        this.a = j;
        if (this.c) {
            ((bfb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    @Override // fm6
    public final void b(ce8 ce8Var) {
        if (this.c) {
            a(h());
        }
        this.e = ce8Var;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        ((bfb) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // fm6
    public final ce8 g() {
        return (ce8) this.e;
    }

    @Override // fm6
    public final long h() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((bfb) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((ce8) this.e).a == 1.0f ? hac.T(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    @Override // fm6
    public final boolean i() {
        return false;
    }
}
