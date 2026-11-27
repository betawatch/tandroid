// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ra9 {
    public final vg0 a;
    public final int b;
    public final vg0 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public ra9(vg0 vg0Var, vg0 vg0Var2, int i) {
        this.a = vg0Var;
        this.b = i;
        this.c = vg0Var2;
    }

    public static void b(vg0 vg0Var) {
        byte b = vg0Var.n;
        if (b == 2) {
            yve.p(b == 2);
            vg0Var.n = (byte) 1;
            vg0Var.x();
        }
    }

    public static boolean k(vg0 vg0Var) {
        return vg0Var.n != 0;
    }

    public static void o(vg0 vg0Var, long j) {
        vg0Var.E = true;
        if (vg0Var instanceof vlb) {
            vlb vlbVar = (vlb) vg0Var;
            yve.p(vlbVar.E);
            vlbVar.c0 = j;
        }
    }

    public final void a(vg0 vg0Var, fc3 fc3Var) {
        yve.p(this.a == vg0Var || this.c == vg0Var);
        if (k(vg0Var)) {
            if (vg0Var == ((vg0) fc3Var.e)) {
                fc3Var.f = null;
                fc3Var.e = null;
                fc3Var.a = true;
            }
            b(vg0Var);
            yve.p(vg0Var.n == 1);
            vg0Var.c.t();
            vg0Var.n = (byte) 0;
            vg0Var.r = null;
            vg0Var.s = null;
            vg0Var.E = false;
            vg0Var.q();
            vg0Var.H = null;
            vg0Var.I = -9223372036854775807L;
        }
    }

    public final int c() {
        boolean k = k(this.a);
        vg0 vg0Var = this.c;
        return (k ? 1 : 0) + ((vg0Var == null || !k(vg0Var)) ? 0 : 1);
    }

    public final vg0 d(yt6 yt6Var) {
        at9 at9Var;
        if (yt6Var == null || (at9Var = yt6Var.c[this.b]) == null) {
            return null;
        }
        vg0 vg0Var = this.a;
        if (vg0Var.r == at9Var) {
            return vg0Var;
        }
        vg0 vg0Var2 = this.c;
        if (vg0Var2 == null || vg0Var2.r != at9Var) {
            return null;
        }
        return vg0Var2;
    }

    public final boolean e(yt6 yt6Var, vg0 vg0Var) {
        if (vg0Var == null) {
            return true;
        }
        at9[] at9VarArr = yt6Var.c;
        int i = this.b;
        at9 at9Var = at9VarArr[i];
        at9 at9Var2 = vg0Var.r;
        if (at9Var2 == null) {
            return true;
        }
        if (at9Var2 == at9Var) {
            if (at9Var == null || vg0Var.m()) {
                return true;
            }
            yt6 yt6Var2 = yt6Var.m;
            if (yt6Var.g.f && yt6Var2 != null && yt6Var2.e && ((vg0Var instanceof vlb) || (vg0Var instanceof zf7) || vg0Var.y >= yt6Var2.e())) {
                return true;
            }
        }
        do {
            yt6Var = yt6Var.m;
            if (yt6Var == null) {
                return false;
            }
        } while (!Objects.equals(yt6Var.c[i], vg0Var.r));
        return true;
    }

    public final boolean f() {
        vg0 vg0Var = this.a;
        boolean n = k(vg0Var) ? vg0Var.n() : true;
        vg0 vg0Var2 = this.c;
        return (vg0Var2 == null || vg0Var2.n == 0) ? n : n & vg0Var2.n();
    }

    public final boolean g() {
        byte b = this.d;
        return b == 2 || b == 5 || b == 3 || b == 4;
    }

    public final boolean h(yt6 yt6Var) {
        byte b = this.d;
        boolean z = (b == 2 || b == 5) && d(yt6Var) == this.a;
        byte b2 = this.d;
        return z || ((b2 == 3 || b2 == 4) && d(yt6Var) == this.c);
    }

    public final boolean i(yt6 yt6Var) {
        return d(yt6Var) != null;
    }

    public final boolean j() {
        byte b = this.d;
        if (b == 0 || b == 2 || b == 5) {
            return k(this.a);
        }
        vg0 vg0Var = this.c;
        vg0Var.getClass();
        return vg0Var.n != 0;
    }

    public final void l(boolean z) {
        if (z) {
            if (this.e) {
                vg0 vg0Var = this.a;
                yve.p(vg0Var.n == 0);
                vg0Var.c.t();
                vg0Var.v();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            vg0 vg0Var2 = this.c;
            vg0Var2.getClass();
            yve.p(vg0Var2.n == 0);
            vg0Var2.c.t();
            vg0Var2.v();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(vg0 vg0Var, yt6 yt6Var, d2c d2cVar, fc3 fc3Var) {
        vg0 vg0Var2;
        byte b;
        byte b2;
        at9[] at9VarArr = yt6Var.c;
        if (vg0Var == null || vg0Var.n == 0 || (vg0Var == (vg0Var2 = this.a) && ((b2 = this.d) == 2 || b2 == 5))) {
            return 1;
        }
        if (vg0Var == this.c && ((b = this.d) == 3 || b == 4)) {
            return 1;
        }
        at9 at9Var = vg0Var.r;
        int i = this.b;
        Object[] objArr = at9Var != at9VarArr[i];
        boolean q = d2cVar.q(i);
        if (!q || objArr != false) {
            if (!vg0Var.E) {
                e74 e74Var = ((e74[]) d2cVar.d)[i];
                int length = e74Var != null ? e74Var.length() : 0;
                ko4[] ko4VarArr = new ko4[length];
                for (int i2 = 0; i2 < length; i2++) {
                    e74Var.getClass();
                    ko4VarArr[i2] = e74Var.i(i2);
                }
                at9 at9Var2 = at9VarArr[i];
                at9Var2.getClass();
                vg0Var.C(ko4VarArr, at9Var2, yt6Var.e(), yt6Var.p, yt6Var.g.a);
                return 3;
            }
            if (!vg0Var.n()) {
                return 0;
            }
            a(vg0Var, fc3Var);
            if (!q || g()) {
                l(vg0Var == vg0Var2);
                return 1;
            }
        }
        return 1;
    }

    public final void n() {
        if (!k(this.a)) {
            l(true);
        }
        vg0 vg0Var = this.c;
        if (vg0Var == null || vg0Var.n != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        vg0 vg0Var = this.a;
        byte b2 = vg0Var.n;
        if (b2 == 1 && this.d != 5) {
            yve.p(b2 == 1);
            vg0Var.n = (byte) 2;
            vg0Var.w();
            return;
        }
        vg0 vg0Var2 = this.c;
        if (vg0Var2 == null || (b = vg0Var2.n) != 1 || this.d == 4) {
            return;
        }
        yve.p(b == 1);
        vg0Var2.n = (byte) 2;
        vg0Var2.w();
    }
}
