package y3;

import d2.v;
import e3.i0;
import g2.n0;
import g2.y;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public final i0 a;
    public u d;
    public e e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final v j;
    public boolean m;
    public final t b = new t();
    public final y c = new y();
    public final y k = new y(1);
    public final y l = new y();

    public h(i0 i0Var, u uVar, e eVar, v vVar) {
        this.a = i0Var;
        this.d = uVar;
        this.e = eVar;
        this.j = vVar;
        this.d = uVar;
        this.e = eVar;
        i0Var.g(vVar);
        e();
    }

    public final int a() {
        int i3 = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i3 | TLObject.FLAG_30 : i3;
    }

    public final s b() {
        if (!this.m) {
            return null;
        }
        t tVar = this.b;
        e eVar = tVar.a;
        String str = n0.a;
        int i3 = eVar.a;
        s sVar = tVar.m;
        if (sVar == null) {
            sVar = this.d.a.l[i3];
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
        int i3 = this.g + 1;
        this.g = i3;
        int[] iArr = this.b.g;
        int i10 = this.h;
        if (i3 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i3, int i10) {
        y yVar;
        s b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i11 = b10.d;
        t tVar = this.b;
        if (i11 != 0) {
            yVar = tVar.n;
        } else {
            byte[] bArr = b10.e;
            String str = n0.a;
            int length = bArr.length;
            y yVar2 = this.l;
            yVar2.L(length, bArr);
            i11 = bArr.length;
            yVar = yVar2;
        }
        boolean z10 = tVar.k && tVar.l[this.f];
        boolean z11 = z10 || i10 != 0;
        y yVar3 = this.k;
        yVar3.a[0] = (byte) ((z11 ? 128 : 0) | i11);
        yVar3.N(0);
        i0 i0Var = this.a;
        i0Var.f(yVar3, 1, 1);
        i0Var.f(yVar, i11, 1);
        if (!z11) {
            return i11 + 1;
        }
        y yVar4 = this.c;
        if (!z10) {
            yVar4.K(8);
            byte[] bArr2 = yVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & hs.e4);
            bArr2[4] = (byte) ((i3 >> 24) & hs.e4);
            bArr2[5] = (byte) ((i3 >> 16) & hs.e4);
            bArr2[6] = (byte) ((i3 >> 8) & hs.e4);
            bArr2[7] = (byte) (i3 & hs.e4);
            i0Var.f(yVar4, 8, 1);
            return i11 + 9;
        }
        y yVar5 = tVar.n;
        int H = yVar5.H();
        yVar5.O(-2);
        int i12 = (H * 6) + 2;
        if (i10 != 0) {
            yVar4.K(i12);
            byte[] bArr3 = yVar4.a;
            yVar5.k(0, i12, bArr3);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & hs.e4);
            bArr3[3] = (byte) (i13 & hs.e4);
        } else {
            yVar4 = yVar5;
        }
        i0Var.f(yVar4, i12, 1);
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
