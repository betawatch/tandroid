package x3;

import f5.w;
import i7.w5;
import j3.s0;
import j3.t0;
import java.util.ArrayList;
import java.util.Arrays;
import q8.z;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i10 = wVar.b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.c(0, bArr.length, bArr2);
        wVar.C(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // x3.i
    public final long b(w wVar) {
        byte[] bArr = wVar.a;
        return (this.i * l3.b.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // x3.i
    public final boolean c(w wVar, long j10, n nVar) {
        if (e(wVar, o)) {
            byte[] copyOf = Arrays.copyOf(wVar.a, wVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = l3.b.a(copyOf);
            if (((t0) nVar.b) == null) {
                s0 s0Var = new s0();
                s0Var.o = "audio/opus";
                s0Var.B = i10;
                s0Var.C = 48000;
                s0Var.q = a2;
                nVar.b = new t0(s0Var);
                return true;
            }
        } else {
            if (!e(wVar, p)) {
                f5.a.j((t0) nVar.b);
                return false;
            }
            f5.a.j((t0) nVar.b);
            if (!this.n) {
                this.n = true;
                wVar.D(8);
                b4.c a10 = w5.a(z.v(w5.b(wVar, false, false).a));
                if (a10 != null) {
                    s0 a11 = ((t0) nVar.b).a();
                    a11.i = a10.a(((t0) nVar.b).s);
                    nVar.b = new t0(a11);
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
