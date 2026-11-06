package z3;

import e2.u;
import f3.j0;
import h2.m0;
import h2.x;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g {
    public final j0 a;
    public t d;
    public d e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final u j;
    public boolean m;
    public final s b = new s();
    public final x c = new x();
    public final x k = new x(1);
    public final x l = new x();

    public g(j0 j0Var, t tVar, d dVar, u uVar) {
        this.a = j0Var;
        this.d = tVar;
        this.e = dVar;
        this.j = uVar;
        this.d = tVar;
        this.e = dVar;
        j0Var.g(uVar);
        e();
    }

    public final int a() {
        int i7 = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i7 | TLObject.FLAG_30 : i7;
    }

    public final r b() {
        if (!this.m) {
            return null;
        }
        s sVar = this.b;
        d dVar = sVar.a;
        String str = m0.a;
        int i7 = dVar.a;
        r rVar = sVar.m;
        if (rVar == null) {
            rVar = this.d.a.l[i7];
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
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i11 = b10.d;
        s sVar = this.b;
        if (i11 != 0) {
            xVar = sVar.n;
        } else {
            byte[] bArr = b10.e;
            String str = m0.a;
            int length = bArr.length;
            x xVar2 = this.l;
            xVar2.L(length, bArr);
            i11 = bArr.length;
            xVar = xVar2;
        }
        boolean z9 = sVar.k && sVar.l[this.f];
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
        x xVar5 = sVar.n;
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
