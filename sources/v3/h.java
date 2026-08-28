package v3;

import d5.y;
import g7.t;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Arrays;
import o8.z;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(y yVar, byte[] bArr) {
        if (yVar.a() < bArr.length) {
            return false;
        }
        int i9 = yVar.b;
        byte[] bArr2 = new byte[bArr.length];
        yVar.c(0, bArr.length, bArr2);
        yVar.C(i9);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // v3.i
    public final long b(y yVar) {
        byte[] bArr = yVar.a;
        return (this.i * j3.b.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // v3.i
    public final boolean c(y yVar, long j10, e3 e3Var) {
        if (e(yVar, o)) {
            byte[] copyOf = Arrays.copyOf(yVar.a, yVar.c);
            int i9 = copyOf[9] & 255;
            ArrayList a2 = j3.b.a(copyOf);
            if (((t0) e3Var.b) == null) {
                s0 s0Var = new s0();
                s0Var.o = "audio/opus";
                s0Var.B = i9;
                s0Var.C = 48000;
                s0Var.q = a2;
                e3Var.b = new t0(s0Var);
                return true;
            }
        } else {
            if (!e(yVar, p)) {
                d5.a.j((t0) e3Var.b);
                return false;
            }
            d5.a.j((t0) e3Var.b);
            if (!this.n) {
                this.n = true;
                yVar.D(8);
                z3.c a3 = t.a(z.v(t.b(yVar, false, false).a));
                if (a3 != null) {
                    s0 a10 = ((t0) e3Var.b).a();
                    a10.i = a3.a(((t0) e3Var.b).s);
                    e3Var.b = new t0(a10);
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
