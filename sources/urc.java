// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class urc implements fv9 {
    public final sk9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public urc(sk9 sk9Var, int i, long j, long j2) {
        this.a = sk9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / sk9Var.c;
        this.d = j3;
        this.e = i(j3);
    }

    @Override // fv9
    public final boolean c() {
        return true;
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    @Override // fv9
    public final ev9 f(long j) {
        sk9 sk9Var = this.a;
        long j2 = this.d - 1;
        long j3 = g8c.j((sk9Var.b * j) / (this.b * 1000000), 0L, j2);
        int i = sk9Var.c;
        long j4 = this.c;
        long i2 = i(j3);
        hv9 hv9Var = new hv9(i2, (i * j3) + j4);
        if (i2 >= j || j3 == j2) {
            return new ev9(hv9Var, hv9Var);
        }
        long j5 = j3 + 1;
        return new ev9(hv9Var, new hv9(i(j5), (i * j5) + j4));
    }

    @Override // fv9
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = g8c.a;
        return g8c.b0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
