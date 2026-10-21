package x3;

import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import e2.x;
import e9.n0;
import f2.q;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i10 = xVar.b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // x3.i
    public final long b(x xVar) {
        byte[] bArr = xVar.a;
        return (this.i * q.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // x3.i
    public final boolean c(x xVar, long j10, n2.e eVar) {
        if (e(xVar, o)) {
            byte[] copyOf = Arrays.copyOf(xVar.a, xVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = q.a(copyOf);
            if (((w) eVar.b) == null) {
                v vVar = new v();
                vVar.q = v0.n("audio/ogg");
                vVar.r = v0.n("audio/opus");
                vVar.J = i10;
                vVar.K = 48000;
                vVar.u = a2;
                eVar.b = new w(vVar);
                return true;
            }
        } else {
            if (!e(xVar, p)) {
                ((w) eVar.b).getClass();
                return false;
            }
            ((w) eVar.b).getClass();
            if (!this.n) {
                this.n = true;
                xVar.O(8);
                t0 r10 = c3.b.r(n0.v(c3.b.u(xVar, false, false).a));
                if (r10 != null) {
                    v a10 = ((w) eVar.b).a();
                    a10.k = r10.b(((w) eVar.b).l);
                    eVar.b = new w(a10);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // x3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = false;
        }
    }
}
