package z3;

import d2.u0;
import d2.v;
import e3.u;
import g2.y;
import java.util.Arrays;
import w2.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends i {
    public u n;
    public z0 o;

    @Override // z3.i
    public final long b(y yVar) {
        byte[] bArr = yVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i3 = (bArr[2] & 255) >> 4;
        if (i3 == 6 || i3 == 7) {
            yVar.O(4);
            yVar.I();
        }
        int s6 = e3.b.s(i3, yVar);
        yVar.N(0);
        return s6;
    }

    @Override // z3.i
    public final boolean c(y yVar, long j10, ua.b bVar) {
        byte[] bArr = yVar.a;
        u uVar = this.n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.n = uVar2;
            d2.u a10 = uVar2.c(Arrays.copyOfRange(bArr, 9, yVar.c), null).a();
            a10.q = u0.n("audio/ogg");
            bVar.b = new v(a10);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            z0 z0Var = this.o;
            if (z0Var != null) {
                z0Var.a = j10;
                bVar.c = z0Var;
            }
            ((v) bVar.b).getClass();
            return false;
        }
        tf.b t10 = e3.b.t(yVar);
        u uVar3 = new u(uVar.a, uVar.b, uVar.c, uVar.d, uVar.e, uVar.g, uVar.h, uVar.j, t10, uVar.l);
        this.n = uVar3;
        z0 z0Var2 = new z0();
        z0Var2.c = uVar3;
        z0Var2.d = t10;
        z0Var2.a = -1L;
        z0Var2.b = -1L;
        this.o = z0Var2;
        return true;
    }

    @Override // z3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.o = null;
        }
    }
}
