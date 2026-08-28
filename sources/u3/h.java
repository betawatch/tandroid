package u3;

import d5.f0;
import d5.y;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public final w a;
    public r d;
    public f e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final q b = new q();
    public final y c = new y();
    public final y j = new y(1);
    public final y k = new y();

    public h(w wVar, r rVar, f fVar) {
        this.a = wVar;
        this.d = rVar;
        this.e = fVar;
        this.d = rVar;
        this.e = fVar;
        wVar.c(rVar.a.f);
        d();
    }

    public final p a() {
        if (!this.l) {
            return null;
        }
        q qVar = this.b;
        f fVar = qVar.a;
        int i9 = f0.a;
        int i10 = fVar.a;
        p pVar = qVar.m;
        if (pVar == null) {
            pVar = this.d.a.k[i10];
        }
        if (pVar == null || !pVar.a) {
            return null;
        }
        return pVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i9 = this.g + 1;
        this.g = i9;
        int[] iArr = this.b.g;
        int i10 = this.h;
        if (i9 != iArr[i10]) {
            return true;
        }
        this.h = i10 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i9, int i10) {
        y yVar;
        p a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i11 = a2.d;
        q qVar = this.b;
        if (i11 != 0) {
            yVar = qVar.n;
        } else {
            byte[] bArr = a2.e;
            int i12 = f0.a;
            int length = bArr.length;
            y yVar2 = this.k;
            yVar2.A(length, bArr);
            i11 = bArr.length;
            yVar = yVar2;
        }
        boolean z10 = qVar.k && qVar.l[this.f];
        boolean z11 = z10 || i10 != 0;
        y yVar3 = this.j;
        yVar3.a[0] = (byte) ((z11 ? 128 : 0) | i11);
        yVar3.C(0);
        w wVar = this.a;
        wVar.d(1, yVar3);
        wVar.d(i11, yVar);
        if (!z11) {
            return i11 + 1;
        }
        y yVar4 = this.c;
        if (!z10) {
            yVar4.z(8);
            byte[] bArr2 = yVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i9 >> 24) & 255);
            bArr2[5] = (byte) ((i9 >> 16) & 255);
            bArr2[6] = (byte) ((i9 >> 8) & 255);
            bArr2[7] = (byte) (i9 & 255);
            wVar.d(8, yVar4);
            return i11 + 9;
        }
        y yVar5 = qVar.n;
        int w8 = yVar5.w();
        yVar5.D(-2);
        int i13 = (w8 * 6) + 2;
        if (i10 != 0) {
            yVar4.z(i13);
            byte[] bArr3 = yVar4.a;
            yVar5.c(0, i13, bArr3);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            yVar4 = yVar5;
        }
        wVar.d(i13, yVar4);
        return i11 + 1 + i13;
    }

    public final void d() {
        q qVar = this.b;
        qVar.d = 0;
        qVar.p = 0L;
        qVar.q = false;
        qVar.k = false;
        qVar.o = false;
        qVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
