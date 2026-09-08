package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import n7.z0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i10 = vVar.b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.h(0, bArr.length, bArr2);
        vVar.J(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // x3.i
    public final long b(v vVar) {
        byte[] bArr = vVar.a;
        return (this.i * c3.b.k(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // x3.i
    public final boolean c(v vVar, long j3, z0 z0Var) {
        if (e(vVar, o)) {
            byte[] copyOf = Arrays.copyOf(vVar.a, vVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = c3.b.a(copyOf);
            if (((s) z0Var.b) == null) {
                r rVar = new r();
                rVar.p = r0.n("audio/ogg");
                rVar.q = r0.n("audio/opus");
                rVar.I = i10;
                rVar.J = 48000;
                rVar.t = a2;
                z0Var.b = new s(rVar);
                return true;
            }
        } else {
            if (!e(vVar, p)) {
                e2.d.h((s) z0Var.b);
                return false;
            }
            e2.d.h((s) z0Var.b);
            if (!this.n) {
                this.n = true;
                vVar.K(8);
                p0 r10 = c3.b.r(i0.w(c3.b.v(vVar, false, false).a));
                if (r10 != null) {
                    r a10 = ((s) z0Var.b).a();
                    a10.k = r10.b(((s) z0Var.b).l);
                    z0Var.b = new s(a10);
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
