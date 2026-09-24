package w3;

import c3.h0;
import e2.d0;
import e2.v;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class h {
    public final h0 a;
    public s d;
    public e e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final b2.s j;
    public boolean m;
    public final r b = new r();
    public final v c = new v();
    public final v k = new v(1);
    public final v l = new v();

    public h(h0 h0Var, s sVar, e eVar, b2.s sVar2) {
        this.a = h0Var;
        this.d = sVar;
        this.e = eVar;
        this.j = sVar2;
        this.d = sVar;
        this.e = eVar;
        h0Var.b(sVar2);
        e();
    }

    public final int a() {
        int i10 = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i10 | TLObject.FLAG_30 : i10;
    }

    public final q b() {
        if (!this.m) {
            return null;
        }
        r rVar = this.b;
        e eVar = rVar.a;
        String str = d0.a;
        int i10 = eVar.a;
        q qVar = rVar.m;
        if (qVar == null) {
            qVar = this.d.a.l[i10];
        }
        if (qVar == null || !qVar.a) {
            return null;
        }
        return qVar;
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
        q b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.d;
        r rVar = this.b;
        if (i12 != 0) {
            vVar = rVar.n;
        } else {
            byte[] bArr = b10.e;
            String str = d0.a;
            int length = bArr.length;
            v vVar2 = this.l;
            vVar2.H(length, bArr);
            i12 = bArr.length;
            vVar = vVar2;
        }
        boolean z10 = rVar.k && rVar.l[this.f];
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
        v vVar5 = rVar.n;
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
        r rVar = this.b;
        rVar.d = 0;
        rVar.p = 0L;
        rVar.q = false;
        rVar.k = false;
        rVar.o = false;
        rVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
