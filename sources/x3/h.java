package x3;

import b2.u0;
import b2.w;
import b2.w0;
import e2.x;
import e9.n0;
import f2.p;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        return (this.i * p.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // x3.i
    public final boolean c(x xVar, long j10, n3.b bVar) {
        if (e(xVar, o)) {
            byte[] copyOf = Arrays.copyOf(xVar.a, xVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = p.a(copyOf);
            if (((b2.x) bVar.b) == null) {
                w wVar = new w();
                wVar.q = w0.n("audio/ogg");
                wVar.r = w0.n("audio/opus");
                wVar.J = i10;
                wVar.K = 48000;
                wVar.u = a2;
                bVar.b = new b2.x(wVar);
                return true;
            }
        } else {
            if (!e(xVar, p)) {
                ((b2.x) bVar.b).getClass();
                return false;
            }
            ((b2.x) bVar.b).getClass();
            if (!this.n) {
                this.n = true;
                xVar.O(8);
                u0 r10 = c3.b.r(n0.v(c3.b.u(xVar, false, false).a));
                if (r10 != null) {
                    w a10 = ((b2.x) bVar.b).a();
                    a10.k = r10.b(((b2.x) bVar.b).l);
                    bVar.b = new b2.x(a10);
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
