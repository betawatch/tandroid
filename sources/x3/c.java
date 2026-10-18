package x3;

import b2.v;
import b2.v0;
import b2.w;
import c3.u;
import e2.x;
import java.util.Arrays;
import n4.s;
import u2.a1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c extends i {
    public u n;
    public a1 o;

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
    public final boolean c(x xVar, long j10, n2.e eVar) {
        byte[] bArr = xVar.a;
        u uVar = this.n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.n = uVar2;
            v a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.c), null).a();
            a2.q = v0.n("audio/ogg");
            eVar.b = new w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            a1 a1Var = this.o;
            if (a1Var != null) {
                a1Var.a = j10;
                eVar.c = a1Var;
            }
            ((w) eVar.b).getClass();
            return false;
        }
        s t10 = c3.b.t(xVar);
        u uVar3 = new u(uVar.a, uVar.b, uVar.c, uVar.d, uVar.e, uVar.g, uVar.h, uVar.j, t10, uVar.l);
        this.n = uVar3;
        a1 a1Var2 = new a1();
        a1Var2.c = uVar3;
        a1Var2.d = t10;
        a1Var2.a = -1L;
        a1Var2.b = -1L;
        this.o = a1Var2;
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
