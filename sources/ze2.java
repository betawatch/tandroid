// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ze2 implements hm6 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public final void a(long j) {
        this.a = j;
        if (this.c) {
            ((vgb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.c) {
            return;
        }
        ((vgb) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // hm6
    public final void c(of8 of8Var) {
        if (this.c) {
            a(g());
        }
        this.e = of8Var;
    }

    @Override // hm6
    public final of8 f() {
        return (of8) this.e;
    }

    @Override // hm6
    public final long g() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((vgb) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((of8) this.e).a == 1.0f ? gcc.T(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    @Override // hm6
    public final boolean h() {
        return false;
    }
}
