package z3;

import h5.d0;
import h5.w;
import r3.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h {
    public final v a;
    public s d;
    public f e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final r b = new r();
    public final w c = new w();
    public final w j = new w(1);
    public final w k = new w();

    public h(v vVar, s sVar, f fVar) {
        this.a = vVar;
        this.d = sVar;
        this.e = fVar;
        this.d = sVar;
        this.e = fVar;
        vVar.b(sVar.a.f);
        d();
    }

    public final q a() {
        if (!this.l) {
            return null;
        }
        r rVar = this.b;
        f fVar = rVar.a;
        int i10 = d0.a;
        int i11 = fVar.a;
        q qVar = rVar.m;
        if (qVar == null) {
            qVar = this.d.a.k[i11];
        }
        if (qVar == null || !qVar.a) {
            return null;
        }
        return qVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
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

    public final int c(int i10, int i11) {
        w wVar;
        q a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i12 = a2.d;
        r rVar = this.b;
        if (i12 != 0) {
            wVar = rVar.n;
        } else {
            byte[] bArr = a2.e;
            int i13 = d0.a;
            int length = bArr.length;
            w wVar2 = this.k;
            wVar2.D(length, bArr);
            i12 = bArr.length;
            wVar = wVar2;
        }
        boolean z4 = rVar.k && rVar.l[this.f];
        boolean z10 = z4 || i11 != 0;
        w wVar3 = this.j;
        wVar3.a[0] = (byte) ((z10 ? 128 : 0) | i12);
        wVar3.F(0);
        v vVar = this.a;
        vVar.a(1, wVar3);
        vVar.a(i12, wVar);
        if (!z10) {
            return i12 + 1;
        }
        w wVar4 = this.c;
        if (!z4) {
            wVar4.C(8);
            byte[] bArr2 = wVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            vVar.a(8, wVar4);
            return i12 + 9;
        }
        w wVar5 = rVar.n;
        int z11 = wVar5.z();
        wVar5.G(-2);
        int i14 = (z11 * 6) + 2;
        if (i11 != 0) {
            wVar4.C(i14);
            byte[] bArr3 = wVar4.a;
            wVar5.e(0, i14, bArr3);
            int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i15 >> 8) & 255);
            bArr3[3] = (byte) (i15 & 255);
        } else {
            wVar4 = wVar5;
        }
        vVar.a(i14, wVar4);
        return i12 + 1 + i14;
    }

    public final void d() {
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
        this.l = false;
    }
}
