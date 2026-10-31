package x3;

import b2.v0;
import b2.w;
import c3.u;
import e2.x;
import java.util.Arrays;
import u2.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends i {
    public u n;
    public z0 o;

    @Override // x3.i
    public final long b(x xVar) {
        byte[] bArr = xVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            xVar.O(4);
            xVar.I();
        }
        int s10 = c3.b.s(i10, xVar);
        xVar.N(0);
        return s10;
    }

    @Override // x3.i
    public final boolean c(x xVar, long j10, m5.e eVar) {
        byte[] bArr = xVar.a;
        u uVar = this.n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.n = uVar2;
            w a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.c), null).a();
            a2.q = v0.n("audio/ogg");
            eVar.b = new b2.x(a2);
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
                eVar.c = z0Var;
            }
            ((b2.x) eVar.b).getClass();
            return false;
        }
        hf.b t10 = c3.b.t(xVar);
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

    @Override // x3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.o = null;
        }
    }
}
