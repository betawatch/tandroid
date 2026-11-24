// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class uh0 implements ze8 {
    public boolean E;
    public boolean F;
    public rz6 H;
    public fe3 J;
    public final byte b;
    public f99 d;
    public int e;
    public we8 f;
    public bfb h;
    public byte n;
    public jr9 r;
    public go4[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final mj4 c = new mj4((byte) 3, false);
    public long y = Long.MIN_VALUE;
    public bqb G = bqb.a;
    public long I = -9223372036854775807L;

    /* JADX WARN: Multi-variable type inference failed */
    public uh0(int i) {
        this.b = i;
    }

    public final int A(mj4 mj4Var, la3 la3Var, int i) {
        boolean z = (i & 1) != 0;
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        int p = jr9Var.p(mj4Var, la3Var, i);
        if (p == -4) {
            if (la3Var.isEndOfStream()) {
                if (!z) {
                    this.y = Long.MIN_VALUE;
                }
                return this.E ? -4 : -3;
            }
            long j = la3Var.e + this.w;
            la3Var.e = j;
            if (!z) {
                this.y = Math.max(this.y, j);
                return p;
            }
        } else if (p == -5) {
            go4 go4Var = (go4) mj4Var.c;
            go4Var.getClass();
            long j2 = go4Var.y;
            if (j2 != Long.MAX_VALUE) {
                fo4 a = go4Var.a();
                a.x = j2 + this.w;
                mj4Var.c = new go4(a);
            }
        }
        return p;
    }

    public abstract void B(long j, long j2);

    public final void C(go4[] go4VarArr, jr9 jr9Var, long j, long j2, rz6 rz6Var) {
        jte.p(!this.E);
        this.r = jr9Var;
        this.H = rz6Var;
        J();
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.s = go4VarArr;
        this.w = j2;
        y(go4VarArr, j, j2, rz6Var);
    }

    public final void D(long j, boolean z, boolean z2) {
        this.E = false;
        this.x = j;
        this.y = j;
        if (!z2) {
            z2 = F(j) != 0;
        }
        s(j, z, z2);
    }

    public final int F(long j) {
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        return jr9Var.m(j - this.w);
    }

    public int G(go4 go4Var) {
        return "application/x-camera-motion".equals(go4Var.t) ? kt6.a(4, 0, 0, 0) : kt6.a(0, 0, 0, 0);
    }

    public int H() {
        return 0;
    }

    public boolean I(long j) {
        return false;
    }

    public final void J() {
        rz6 rz6Var;
        if (this.G.p() || (rz6Var = this.H) == null) {
            this.I = -9223372036854775807L;
            return;
        }
        int b = this.G.b(rz6Var.a);
        if (b == -1) {
            this.I = -9223372036854775807L;
            return;
        }
        this.I = this.G.f(b, new ypb(), false).d;
        int i = rz6Var.b;
        if (i != -1) {
            this.I = da.c.a(i).e[rz6Var.c];
            return;
        }
        int i2 = rz6Var.e;
        if (i2 != -1) {
            da.c.a(i2).getClass();
            this.I = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u64 e(Throwable th, go4 go4Var, boolean z, int i) {
        int i2;
        if (go4Var != null && !this.F) {
            this.F = true;
            try {
                i2 = G(go4Var) & 7;
            } catch (u64 unused) {
            } finally {
                this.F = false;
            }
            return new u64(1, th, i, l(), this.e, go4Var, go4Var != null ? 4 : i2, this.H, z);
        }
        i2 = 4;
        return new u64(1, th, i, l(), this.e, go4Var, go4Var != null ? 4 : i2, this.H, z);
    }

    public long j(long j, long j2) {
        if (this.n == 1) {
            return (o() || n()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public fm6 k() {
        return null;
    }

    public String l() {
        return "CameraMotionRenderer";
    }

    public final boolean m() {
        return this.y == Long.MIN_VALUE;
    }

    public boolean n() {
        return m();
    }

    public boolean o() {
        return true;
    }

    public final boolean p() {
        if (m()) {
            return this.E;
        }
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        return jr9Var.i();
    }

    public abstract void q();

    public abstract void s(long j, boolean z, boolean z2);

    public final void u() {
        fe3 fe3Var;
        synchronized (this.a) {
            fe3Var = this.J;
        }
        if (fe3Var != null) {
            fe3Var.g.getClass();
        }
    }

    public void f() {
    }

    public void t() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    public void z() {
    }

    public void E(float f, float f2) {
    }

    @Override // ze8
    public void d(int i, Object obj) {
    }

    public void r(boolean z, boolean z2) {
    }

    public void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
    }
}
