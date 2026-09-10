package zd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public t0(long j3) {
        this.a = j3;
    }

    public final ee.y a() {
        Object obj = this._heap;
        if (obj instanceof ee.y) {
            return (ee.y) obj;
        }
        return null;
    }

    public final int c(long j3, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == e0.b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (v0.r.get(v0Var) != 0) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.c = j3;
                    } else {
                        long j10 = t0Var.a;
                        if (j10 - j3 < 0) {
                            j3 = j10;
                        }
                        if (j3 - u0Var.c > 0) {
                            u0Var.c = j3;
                        }
                    }
                    long j11 = this.a;
                    long j12 = u0Var.c;
                    if (j11 - j12 < 0) {
                        this.a = j12;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.a - ((t0) obj).a;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    @Override // zd.o0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ee.v vVar = e0.b;
                if (obj == vVar) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    u0Var.c(this);
                }
                this._heap = vVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(u0 u0Var) {
        if (this._heap == e0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
