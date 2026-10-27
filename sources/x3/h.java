package x3;

import b2.u0;
import b2.w;
import b2.w0;
import e2.x;
import f2.q;
import f9.i0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final boolean c(x xVar, long j10, m4.c cVar) {
        if (e(xVar, o)) {
            byte[] copyOf = Arrays.copyOf(xVar.a, xVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = q.a(copyOf);
            if (((b2.x) cVar.b) == null) {
                w wVar = new w();
                wVar.q = w0.n("audio/ogg");
                wVar.r = w0.n("audio/opus");
                wVar.J = i10;
                wVar.K = 48000;
                wVar.u = a2;
                cVar.b = new b2.x(wVar);
                return true;
            }
        } else {
            if (!e(xVar, p)) {
                ((b2.x) cVar.b).getClass();
                return false;
            }
            ((b2.x) cVar.b).getClass();
            if (!this.n) {
                this.n = true;
                xVar.O(8);
                u0 r6 = c3.b.r(i0.v(c3.b.u(xVar, false, false).a));
                if (r6 != null) {
                    w a10 = ((b2.x) cVar.b).a();
                    a10.k = r6.b(((b2.x) cVar.b).l);
                    cVar.b = new b2.x(a10);
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
