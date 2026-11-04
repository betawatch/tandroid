package z3;

import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import g2.y;
import g9.i0;
import h2.o;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(y yVar, byte[] bArr) {
        if (yVar.a() < bArr.length) {
            return false;
        }
        int i3 = yVar.b;
        byte[] bArr2 = new byte[bArr.length];
        yVar.k(0, bArr.length, bArr2);
        yVar.N(i3);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // z3.i
    public final long b(y yVar) {
        byte[] bArr = yVar.a;
        return (this.i * o.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // z3.i
    public final boolean c(y yVar, long j10, ua.b bVar) {
        if (e(yVar, o)) {
            byte[] copyOf = Arrays.copyOf(yVar.a, yVar.c);
            int i3 = copyOf[9] & 255;
            ArrayList a10 = o.a(copyOf);
            if (((v) bVar.b) == null) {
                u uVar = new u();
                uVar.q = u0.n("audio/ogg");
                uVar.r = u0.n("audio/opus");
                uVar.J = i3;
                uVar.K = 48000;
                uVar.u = a10;
                bVar.b = new v(uVar);
                return true;
            }
        } else {
            if (!e(yVar, p)) {
                ((v) bVar.b).getClass();
                return false;
            }
            ((v) bVar.b).getClass();
            if (!this.n) {
                this.n = true;
                yVar.O(8);
                s0 r5 = e3.b.r(i0.r(e3.b.u(yVar, false, false).a));
                if (r5 != null) {
                    u a11 = ((v) bVar.b).a();
                    a11.k = r5.b(((v) bVar.b).l);
                    bVar.b = new v(a11);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // z3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = false;
        }
    }
}
