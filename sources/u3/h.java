package u3;

import d5.g0;
import d5.z;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h {
    public final w a;
    public s d;
    public f e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final r b = new r();
    public final z c = new z();
    public final z j = new z(1);
    public final z k = new z();

    public h(w wVar, s sVar, f fVar) {
        this.a = wVar;
        this.d = sVar;
        this.e = fVar;
        this.d = sVar;
        this.e = fVar;
        wVar.c(sVar.a.f);
        d();
    }

    public final q a() {
        if (!this.l) {
            return null;
        }
        r rVar = this.b;
        f fVar = rVar.a;
        int i10 = g0.a;
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
        z zVar;
        q a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i12 = a2.d;
        r rVar = this.b;
        if (i12 != 0) {
            zVar = rVar.n;
        } else {
            byte[] bArr = a2.e;
            int i13 = g0.a;
            int length = bArr.length;
            z zVar2 = this.k;
            zVar2.A(length, bArr);
            i12 = bArr.length;
            zVar = zVar2;
        }
        boolean z10 = rVar.k && rVar.l[this.f];
        boolean z11 = z10 || i11 != 0;
        z zVar3 = this.j;
        zVar3.a[0] = (byte) ((z11 ? 128 : 0) | i12);
        zVar3.C(0);
        w wVar = this.a;
        wVar.d(1, zVar3);
        wVar.d(i12, zVar);
        if (!z11) {
            return i12 + 1;
        }
        z zVar4 = this.c;
        if (!z10) {
            zVar4.z(8);
            byte[] bArr2 = zVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            wVar.d(8, zVar4);
            return i12 + 9;
        }
        z zVar5 = rVar.n;
        int w10 = zVar5.w();
        zVar5.D(-2);
        int i14 = (w10 * 6) + 2;
        if (i11 != 0) {
            zVar4.z(i14);
            byte[] bArr3 = zVar4.a;
            zVar5.c(0, i14, bArr3);
            int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i15 >> 8) & 255);
            bArr3[3] = (byte) (i15 & 255);
        } else {
            zVar4 = zVar5;
        }
        wVar.d(i14, zVar4);
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
