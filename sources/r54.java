// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class r54 implements Runnable, Comparable, xp3 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public r54(long j) {
        this.a = j;
    }

    public final fpb b() {
        Object obj = this._heap;
        if (obj instanceof fpb) {
            return (fpb) obj;
        }
        return null;
    }

    public final int c(long j, s54 s54Var, t54 t54Var) {
        synchronized (this) {
            if (this._heap == bbd.a) {
                return 2;
            }
            synchronized (s54Var) {
                r54[] r54VarArr = s54Var.a;
                r54 r54Var = r54VarArr != null ? r54VarArr[0] : null;
                int i = t54.s;
                if (fy.a.getIntVolatile(t54Var, t54.n) != 0) {
                    return 1;
                }
                if (r54Var == null) {
                    s54Var.c = j;
                } else {
                    long j2 = r54Var.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    long j3 = s54Var.c;
                    if (j - j3 > 0) {
                        s54Var.c = j;
                    } else {
                        j = j3;
                    }
                }
                if (this.a - j < 0) {
                    this.a = j;
                }
                s54Var.a(this);
                return 0;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((r54) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(s54 s54Var) {
        if (this._heap != bbd.a) {
            this._heap = s54Var;
        } else {
            u36.j("Failed requirement.");
        }
    }

    @Override // xp3
    public final void dispose() {
        synchronized (this) {
            Object obj = this._heap;
            du2 du2Var = bbd.a;
            if (obj == du2Var) {
                return;
            }
            s54 s54Var = obj instanceof s54 ? (s54) obj : null;
            if (s54Var != null) {
                s54Var.c(this);
            }
            this._heap = du2Var;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
