package v3;

import d5.z;
import h3.s0;
import h3.t0;
import h7.t;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(z zVar, byte[] bArr) {
        if (zVar.a() < bArr.length) {
            return false;
        }
        int i10 = zVar.b;
        byte[] bArr2 = new byte[bArr.length];
        zVar.c(0, bArr.length, bArr2);
        zVar.C(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // v3.i
    public final long b(z zVar) {
        byte[] bArr = zVar.a;
        return (this.i * j3.b.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // v3.i
    public final boolean c(z zVar, long j10, i6 i6Var) {
        if (e(zVar, o)) {
            byte[] copyOf = Arrays.copyOf(zVar.a, zVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = j3.b.a(copyOf);
            if (((t0) i6Var.b) == null) {
                s0 s0Var = new s0();
                s0Var.o = "audio/opus";
                s0Var.B = i10;
                s0Var.C = 48000;
                s0Var.q = a2;
                i6Var.b = new t0(s0Var);
                return true;
            }
        } else {
            if (!e(zVar, p)) {
                d5.a.j((t0) i6Var.b);
                return false;
            }
            d5.a.j((t0) i6Var.b);
            if (!this.n) {
                this.n = true;
                zVar.D(8);
                z3.c a3 = t.a(p8.z.v(t.b(zVar, false, false).a));
                if (a3 != null) {
                    s0 a10 = ((t0) i6Var.b).a();
                    a10.i = a3.a(((t0) i6Var.b).s);
                    i6Var.b = new t0(a10);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // v3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = false;
        }
    }
}
