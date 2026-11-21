package zd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class q0 implements Runnable, Comparable, l0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public q0(long j3) {
        this.a = j3;
    }

    public final ee.v b() {
        Object obj = this._heap;
        if (obj instanceof ee.v) {
            return (ee.v) obj;
        }
        return null;
    }

    public final int c(long j3, r0 r0Var, s0 s0Var) {
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
                        r0Var.c = j3;
                    } else {
                        long j10 = q0Var.a;
                        if (j10 - j3 < 0) {
                            j3 = j10;
                        }
                        if (j3 - r0Var.c > 0) {
                            r0Var.c = j3;
                        }
                    }
                    long j11 = this.a;
                    long j12 = r0Var.c;
                    if (j11 - j12 < 0) {
                        this.a = j12;
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
        long j3 = this.a - ((q0) obj).a;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    public final void d(r0 r0Var) {
        if (this._heap == b0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = r0Var;
    }

    @Override // zd.l0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ee.t tVar = b0.b;
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

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
