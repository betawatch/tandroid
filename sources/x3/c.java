package x3;

import b2.v;
import b2.v0;
import c3.w;
import e2.x;
import java.util.Arrays;
import n4.s;
import u2.b1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends i {
    public w n;
    public b1 o;

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
        w wVar = this.n;
        if (wVar == null) {
            w wVar2 = new w(bArr, 17);
            this.n = wVar2;
            v a2 = wVar2.c(Arrays.copyOfRange(bArr, 9, xVar.c), null).a();
            a2.q = v0.n("audio/ogg");
            eVar.b = new b2.w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            b1 b1Var = this.o;
            if (b1Var != null) {
                b1Var.a = j10;
                eVar.c = b1Var;
            }
            ((b2.w) eVar.b).getClass();
            return false;
        }
        s t10 = c3.b.t(xVar);
        w wVar3 = new w(wVar.a, wVar.b, wVar.c, wVar.d, wVar.e, wVar.g, wVar.h, wVar.j, t10, wVar.l);
        this.n = wVar3;
        b1 b1Var2 = new b1();
        b1Var2.c = wVar3;
        b1Var2.d = t10;
        b1Var2.a = -1L;
        b1Var2.b = -1L;
        this.o = b1Var2;
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
