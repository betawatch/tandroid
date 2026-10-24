package w3;

import b2.w;
import c3.l0;
import e2.m0;
import e2.x;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g {
    public final l0 a;
    public t d;
    public d e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final w j;
    public boolean m;
    public final s b = new s();
    public final x c = new x();
    public final x k = new x(1);
    public final x l = new x();

    public g(l0 l0Var, t tVar, d dVar, w wVar) {
        this.a = l0Var;
        this.d = tVar;
        this.e = dVar;
        this.j = wVar;
        this.d = tVar;
        this.e = dVar;
        l0Var.b(wVar);
        e();
    }

    public final int a() {
        int i10 = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i10 | TLObject.FLAG_30 : i10;
    }

    public final r b() {
        if (!this.m) {
            return null;
        }
        s sVar = this.b;
        d dVar = sVar.a;
        String str = m0.a;
        int i10 = dVar.a;
        r rVar = sVar.m;
        if (rVar == null) {
            rVar = this.d.a.l[i10];
        }
        if (rVar == null || !rVar.a) {
            return null;
        }
        return rVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i10 = this.g + 1;
        this.g = i10;
        int[] iArr = this.b.g;
        int i11 = this.h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.h = i11 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        x xVar;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        s sVar = this.b;
        if (i12 != 0) {
            xVar = sVar.n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.a;
            int length = bArr.length;
            x xVar2 = this.l;
            xVar2.L(length, bArr);
            i12 = bArr.length;
            xVar = xVar2;
        }
        boolean z10 = sVar.k && sVar.l[this.f];
        boolean z11 = z10 || i11 != 0;
        x xVar3 = this.k;
        xVar3.a[0] = (byte) ((z11 ? 128 : 0) | i12);
        xVar3.N(0);
        l0 l0Var = this.a;
        l0Var.g(xVar3, 1, 1);
        l0Var.g(xVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        x xVar4 = this.c;
        if (!z10) {
            xVar4.K(8);
            byte[] bArr2 = xVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            l0Var.g(xVar4, 8, 1);
            return i12 + 9;
        }
        x xVar5 = sVar.n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i13 = (H * 6) + 2;
        if (i11 != 0) {
            xVar4.K(i13);
            byte[] bArr3 = xVar4.a;
            xVar5.k(0, i13, bArr3);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            xVar4 = xVar5;
        }
        l0Var.g(xVar4, i13, 1);
        return i12 + 1 + i13;
    }

    public final void e() {
        s sVar = this.b;
        sVar.d = 0;
        sVar.p = 0L;
        sVar.q = false;
        sVar.k = false;
        sVar.o = false;
        sVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
