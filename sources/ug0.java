// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ug0 implements xc8 {
    public boolean E;
    public boolean F;
    public rx6 H;
    public sc3 J;
    public final byte b;
    public d79 d;
    public int e;
    public uc8 f;
    public adb h;
    public byte n;
    public ip9 r;
    public fm4[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final sk4 c = new sk4((byte) 1, false);
    public long y = Long.MIN_VALUE;
    public aob G = aob.a;
    public long I = -9223372036854775807L;

    /* JADX WARN: Multi-variable type inference failed */
    public ug0(int i) {
        this.b = i;
    }

    public final int A(sk4 sk4Var, z83 z83Var, int i) {
        boolean z = (i & 1) != 0;
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        int h = ip9Var.h(sk4Var, z83Var, i);
        if (h == -4) {
            if (z83Var.isEndOfStream()) {
                if (!z) {
                    this.y = Long.MIN_VALUE;
                }
                return this.E ? -4 : -3;
            }
            long j = z83Var.e + this.w;
            z83Var.e = j;
            if (!z) {
                this.y = Math.max(this.y, j);
                return h;
            }
        } else if (h == -5) {
            fm4 fm4Var = (fm4) sk4Var.c;
            fm4Var.getClass();
            long j2 = fm4Var.y;
            if (j2 != Long.MAX_VALUE) {
                em4 a = fm4Var.a();
                a.x = j2 + this.w;
                sk4Var.c = new fm4(a);
            }
        }
        return h;
    }

    public abstract void B(long j, long j2);

    public final void C(fm4[] fm4VarArr, ip9 ip9Var, long j, long j2, rx6 rx6Var) {
        gre.p(!this.E);
        this.r = ip9Var;
        this.H = rx6Var;
        J();
        if (this.y == Long.MIN_VALUE) {
            this.y = j;
        }
        this.s = fm4VarArr;
        this.w = j2;
        y(fm4VarArr, j, j2, rx6Var);
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
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        return ip9Var.n(j - this.w);
    }

    public int G(fm4 fm4Var) {
        return "application/x-camera-motion".equals(fm4Var.t) ? ls6.a(4, 0, 0, 0) : ls6.a(0, 0, 0, 0);
    }

    public int H() {
        return 0;
    }

    public boolean I(long j) {
        return false;
    }

    public final void J() {
        rx6 rx6Var;
        if (this.G.p() || (rx6Var = this.H) == null) {
            this.I = -9223372036854775807L;
            return;
        }
        int b = this.G.b(rx6Var.a);
        if (b == -1) {
            this.I = -9223372036854775807L;
            return;
        }
        this.I = this.G.f(b, new xnb(), false).d;
        int i = rx6Var.b;
        if (i != -1) {
            this.I = da.c.a(i).e[rx6Var.c];
            return;
        }
        int i2 = rx6Var.e;
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
    public final j54 e(Throwable th, fm4 fm4Var, boolean z, int i) {
        int i2;
        if (fm4Var != null && !this.F) {
            this.F = true;
            try {
                i2 = G(fm4Var) & 7;
            } catch (j54 unused) {
            } finally {
                this.F = false;
            }
            return new j54(1, th, i, l(), this.e, fm4Var, fm4Var != null ? 4 : i2, this.H, z);
        }
        i2 = 4;
        return new j54(1, th, i, l(), this.e, fm4Var, fm4Var != null ? 4 : i2, this.H, z);
    }

    public long j(long j, long j2) {
        if (this.n == 1) {
            return (o() || n()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public ck6 k() {
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
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        return ip9Var.j();
    }

    public abstract void q();

    public abstract void s(long j, boolean z, boolean z2);

    public final void u() {
        sc3 sc3Var;
        synchronized (this.a) {
            sc3Var = this.J;
        }
        if (sc3Var != null) {
            sc3Var.g.getClass();
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

    @Override // xc8
    public void d(int i, Object obj) {
    }

    public void r(boolean z, boolean z2) {
    }

    public void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
    }
}
