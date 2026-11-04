package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class q0 implements Runnable, Comparable, l0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public q0(long j10) {
        this.a = j10;
    }

    public final be.v b() {
        Object obj = this._heap;
        if (obj instanceof be.v) {
            return (be.v) obj;
        }
        return null;
    }

    public final int c(long j10, r0 r0Var, s0 s0Var) {
        synchronized (this) {
            if (this._heap == b0.b) {
                return 2;
            }
            synchronized (r0Var) {
                try {
                    q0[] q0VarArr = r0Var.a;
                    q0 q0Var = q0VarArr != null ? q0VarArr[0] : null;
                    if (s0.r.get(s0Var) != 0) {
                        return 1;
                    }
                    if (q0Var == null) {
                        r0Var.c = j10;
                    } else {
                        long j11 = q0Var.a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - r0Var.c > 0) {
                            r0Var.c = j10;
                        }
                    }
                    long j12 = this.a;
                    long j13 = r0Var.c;
                    if (j12 - j13 < 0) {
                        this.a = j13;
                    }
                    r0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.a - ((q0) obj).a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override // wd.l0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                be.t tVar = b0.b;
                if (obj == tVar) {
                    return;
                }
                r0 r0Var = obj instanceof r0 ? (r0) obj : null;
                if (r0Var != null) {
                    r0Var.b(this);
                }
                this._heap = tVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(r0 r0Var) {
        if (this._heap == b0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = r0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
