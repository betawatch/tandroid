// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ty0 implements lr7 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public ty0(long j, int i) {
        yve.p(((nj) this.c) == null);
        this.a = j;
        this.b = j + i;
    }

    @Override // lr7
    public final zy9 C() {
        yve.p(this.a != -1);
        return new qc0((gk4) this.c, this.a, (byte) 1);
    }

    public final fa4 a(int i, long j) {
        boolean z = j != 0 && j == this.a;
        for (int i2 : (int[]) this.d) {
            z |= i2 == i;
        }
        fa4 fa4Var = (fa4) this.c;
        return new fa4(fa4Var.a, fa4Var.b, z ? "opened" : "neighbour");
    }

    public final void b(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            ((n40) ((ja3) this.d).r).getClass();
            synchronized (l40.s) {
                z = l40.u > 0;
            }
            if (!z) {
                this.a = 200 + elapsedRealtime;
            }
        }
        long j = this.a;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.b = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    @Override // lr7
    public final long p(cb3 cb3Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // lr7
    public final void p0(long j) {
        long[] jArr = (long[]) ((lh2) this.d).b;
        this.b = jArr[gcc.f(jArr, j, true)];
    }

    public /* synthetic */ ty0(Object obj, Object obj2, long j, long j2) {
        this.c = obj;
        this.d = obj2;
        this.a = j;
        this.b = j2;
    }

    public ty0(ja3 ja3Var) {
        this.d = ja3Var;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
