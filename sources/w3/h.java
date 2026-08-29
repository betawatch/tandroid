package w3;

import f5.d0;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final f5.w c = new f5.w();
    public final f5.w j = new f5.w(1);
    public final f5.w k = new f5.w();

    public h(w wVar, r rVar, f fVar) {
        this.a = wVar;
        this.d = rVar;
        this.e = fVar;
        this.d = rVar;
        this.e = fVar;
        wVar.b(rVar.a.f);
        d();
    }

    public final p a() {
        if (!this.l) {
            return null;
        }
        q qVar = this.b;
        f fVar = qVar.a;
        int i10 = d0.a;
        int i11 = fVar.a;
        p pVar = qVar.m;
        if (pVar == null) {
            pVar = this.d.a.k[i11];
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
        f5.w wVar;
        p a2 = a();
        if (a2 == null) {
            return 0;
        }
        int i12 = a2.d;
        q qVar = this.b;
        if (i12 != 0) {
            wVar = qVar.n;
        } else {
            byte[] bArr = a2.e;
            int i13 = d0.a;
            int length = bArr.length;
            f5.w wVar2 = this.k;
            wVar2.A(length, bArr);
            i12 = bArr.length;
            wVar = wVar2;
        }
        boolean z10 = qVar.k && qVar.l[this.f];
        boolean z11 = z10 || i11 != 0;
        f5.w wVar3 = this.j;
        wVar3.a[0] = (byte) ((z11 ? 128 : 0) | i12);
        wVar3.C(0);
        w wVar4 = this.a;
        wVar4.d(1, wVar3);
        wVar4.d(i12, wVar);
        if (!z11) {
            return i12 + 1;
        }
        f5.w wVar5 = this.c;
        if (!z10) {
            wVar5.z(8);
            byte[] bArr2 = wVar5.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            wVar4.d(8, wVar5);
            return i12 + 9;
        }
        f5.w wVar6 = qVar.n;
        int w10 = wVar6.w();
        wVar6.D(-2);
        int i14 = (w10 * 6) + 2;
        if (i11 != 0) {
            wVar5.z(i14);
            byte[] bArr3 = wVar5.a;
            wVar6.c(0, i14, bArr3);
            int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i15 >> 8) & 255);
            bArr3[3] = (byte) (i15 & 255);
        } else {
            wVar5 = wVar6;
        }
        wVar4.d(i14, wVar5);
        return i12 + 1 + i14;
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
