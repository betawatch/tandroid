package z3;

import f3.j0;
import h2.m0;
import h2.x;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class g {
    public final j0 a;
    public u d;
    public d e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final e2.u j;
    public boolean m;
    public final t b = new t();
    public final x c = new x();
    public final x k = new x(1);
    public final x l = new x();

    public g(j0 j0Var, u uVar, d dVar, e2.u uVar2) {
        this.a = j0Var;
        this.d = uVar;
        this.e = dVar;
        this.j = uVar2;
        this.d = uVar;
        this.e = dVar;
        j0Var.g(uVar2);
        e();
    }

    public final int a() {
        int i7 = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i7 | TLObject.FLAG_30 : i7;
    }

    public final s b() {
        if (!this.m) {
            return null;
        }
        t tVar = this.b;
        d dVar = tVar.a;
        String str = m0.a;
        int i7 = dVar.a;
        s sVar = tVar.m;
        if (sVar == null) {
            sVar = this.d.a.l[i7];
        }
        if (sVar == null || !sVar.a) {
            return null;
        }
        return sVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i7 = this.g + 1;
        this.g = i7;
        int[] iArr = this.b.g;
        int i10 = this.h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i7, int i10) {
        x xVar;
        s b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i11 = b10.d;
        t tVar = this.b;
        if (i11 != 0) {
            xVar = tVar.n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.a;
            int length = bArr.length;
            x xVar2 = this.l;
            xVar2.L(length, bArr);
            i11 = bArr.length;
            xVar = xVar2;
        }
        boolean z9 = tVar.k && tVar.l[this.f];
        boolean z10 = z9 || i10 != 0;
        x xVar3 = this.k;
        xVar3.a[0] = (byte) ((z10 ? 128 : 0) | i11);
        xVar3.N(0);
        j0 j0Var = this.a;
        j0Var.a(xVar3, 1, 1);
        j0Var.a(xVar, i11, 1);
        if (!z10) {
            return i11 + 1;
        }
        x xVar4 = this.c;
        if (!z9) {
            xVar4.K(8);
            byte[] bArr2 = xVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & qs.e4);
            bArr2[4] = (byte) ((i7 >> 24) & qs.e4);
            bArr2[5] = (byte) ((i7 >> 16) & qs.e4);
            bArr2[6] = (byte) ((i7 >> 8) & qs.e4);
            bArr2[7] = (byte) (i7 & qs.e4);
            j0Var.a(xVar4, 8, 1);
            return i11 + 9;
        }
        x xVar5 = tVar.n;
        int H = xVar5.H();
        xVar5.O(-2);
        int i12 = (H * 6) + 2;
        if (i10 != 0) {
            xVar4.K(i12);
            byte[] bArr3 = xVar4.a;
            xVar5.k(0, i12, bArr3);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & qs.e4);
            bArr3[3] = (byte) (i13 & qs.e4);
        } else {
            xVar4 = xVar5;
        }
        j0Var.a(xVar4, i12, 1);
        return i11 + 1 + i12;
    }

    public final void e() {
        t tVar = this.b;
        tVar.d = 0;
        tVar.p = 0L;
        tVar.q = false;
        tVar.k = false;
        tVar.o = false;
        tVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
