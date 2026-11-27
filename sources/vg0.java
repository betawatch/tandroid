// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class vg0 implements lg8 {
    public boolean E;
    public boolean F;
    public vz6 H;
    public ld3 J;
    public final byte b;
    public qa9 d;
    public int e;
    public ig8 f;
    public vgb h;
    public byte n;
    public at9 r;
    public ko4[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final ym4 c = new ym4((byte) 1, false);
    public long y = Long.MIN_VALUE;
    public asb G = asb.a;
    public long I = -9223372036854775807L;

    /* JADX WARN: Multi-variable type inference failed */
    public vg0(int i) {
        this.b = i;
    }

    public final int A(ym4 ym4Var, s93 s93Var, int i) {
        boolean z = (i & 1) != 0;
        at9 at9Var = this.r;
        at9Var.getClass();
        int i2 = at9Var.i(ym4Var, s93Var, i);
        if (i2 == -4) {
            if (s93Var.isEndOfStream()) {
                if (!z) {
                    this.y = Long.MIN_VALUE;
                }
                return this.E ? -4 : -3;
            }
            long j = s93Var.e + this.w;
            s93Var.e = j;
            if (!z) {
                this.y = Math.max(this.y, j);
                return i2;
            }
        } else if (i2 == -5) {
            ko4 ko4Var = (ko4) ym4Var.c;
            ko4Var.getClass();
            long j2 = ko4Var.y;
            if (j2 != Long.MAX_VALUE) {
                jo4 a = ko4Var.a();
                a.x = j2 + this.w;
                ym4Var.c = new ko4(a);
            }
        }
        return i2;
    }

    public abstract void B(long j, long j2);

    public final void C(ko4[] ko4VarArr, at9 at9Var, long j, long j2, vz6 vz6Var) {
        yve.p(!this.E);
        this.r = at9Var;
        this.H = vz6Var;
        J();
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.s = ko4VarArr;
        this.w = j2;
        y(ko4VarArr, j, j2, vz6Var);
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
        at9 at9Var = this.r;
        at9Var.getClass();
        return at9Var.o(j - this.w);
    }

    public int G(ko4 ko4Var) {
        return "application/x-camera-motion".equals(ko4Var.t) ? qu6.a(4, 0, 0, 0) : qu6.a(0, 0, 0, 0);
    }

    public int H() {
        return 0;
    }

    public boolean I(long j) {
        return false;
    }

    public final void J() {
        vz6 vz6Var;
        if (this.G.p() || (vz6Var = this.H) == null) {
            this.I = -9223372036854775807L;
            return;
        }
        int b = this.G.b(vz6Var.a);
        if (b == -1) {
            this.I = -9223372036854775807L;
            return;
        }
        this.I = this.G.f(b, new xrb(), false).d;
        int i = vz6Var.b;
        if (i != -1) {
            this.I = ea.c.a(i).e[vz6Var.c];
            return;
        }
        int i2 = vz6Var.e;
        if (i2 != -1) {
            ea.c.a(i2).getClass();
            this.I = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e64 e(Throwable th, ko4 ko4Var, boolean z, int i) {
        int i2;
        if (ko4Var != null && !this.F) {
            this.F = true;
            try {
                i2 = G(ko4Var) & 7;
            } catch (e64 unused) {
            } finally {
                this.F = false;
            }
            return new e64(1, th, i, l(), this.e, ko4Var, ko4Var != null ? 4 : i2, this.H, z);
        }
        i2 = 4;
        return new e64(1, th, i, l(), this.e, ko4Var, ko4Var != null ? 4 : i2, this.H, z);
    }

    public long j(long j, long j2) {
        if (this.n == 1) {
            return (o() || n()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public hm6 k() {
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
        at9 at9Var = this.r;
        at9Var.getClass();
        return at9Var.k();
    }

    public abstract void q();

    public abstract void s(long j, boolean z, boolean z2);

    public final void u() {
        ld3 ld3Var;
        synchronized (this.a) {
            ld3Var = this.J;
        }
        if (ld3Var != null) {
            ld3Var.g.getClass();
        }
    }

    public void i() {
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

    @Override // lg8
    public void d(int i, Object obj) {
    }

    public void r(boolean z, boolean z2) {
    }

    public void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
    }
}
