package w3;

import c3.h0;
import e2.d0;
import e2.v;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i {
    public final h0 a;
    public t d;
    public f e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final b2.s j;
    public boolean m;
    public final s b = new s();
    public final v c = new v();
    public final v k = new v(1);
    public final v l = new v();

    public i(h0 h0Var, t tVar, f fVar, b2.s sVar) {
        this.a = h0Var;
        this.d = tVar;
        this.e = fVar;
        this.j = sVar;
        this.d = tVar;
        this.e = fVar;
        h0Var.b(sVar);
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
        f fVar = sVar.a;
        String str = d0.a;
        int i10 = fVar.a;
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
        v vVar;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        s sVar = this.b;
        if (i12 != 0) {
            vVar = sVar.n;
        } else {
            byte[] bArr = b10.e;
            String str = d0.a;
            int length = bArr.length;
            v vVar2 = this.l;
            vVar2.H(length, bArr);
            i12 = bArr.length;
            vVar = vVar2;
        }
        boolean z10 = sVar.k && sVar.l[this.f];
        boolean z11 = z10 || i11 != 0;
        v vVar3 = this.k;
        vVar3.a[0] = (byte) ((z11 ? 128 : 0) | i12);
        vVar3.J(0);
        h0 h0Var = this.a;
        h0Var.f(vVar3, 1, 1);
        h0Var.f(vVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        v vVar4 = this.c;
        if (!z10) {
            vVar4.G(8);
            byte[] bArr2 = vVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            h0Var.f(vVar4, 8, 1);
            return i12 + 9;
        }
        v vVar5 = sVar.n;
        int D = vVar5.D();
        vVar5.K(-2);
        int i13 = (D * 6) + 2;
        if (i11 != 0) {
            vVar4.G(i13);
            byte[] bArr3 = vVar4.a;
            vVar5.h(0, i13, bArr3);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            vVar4 = vVar5;
        }
        h0Var.f(vVar4, i13, 1);
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
