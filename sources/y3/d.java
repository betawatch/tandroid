package y3;

import j3.t1;
import java.io.EOFException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements o3.k {
    public final int a;
    public final f5.w d;
    public final f5.v e;
    public o3.m f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(null, true);
    public final f5.w c = new f5.w(2048);
    public int i = -1;
    public long h = -1;

    public d(int i10) {
        this.a = i10;
        f5.w wVar = new f5.w(10);
        this.d = wVar;
        byte[] bArr = wVar.a;
        this.e = new f5.v(bArr, bArr.length);
    }

    public final int a(o3.l lVar) {
        int i10 = 0;
        while (true) {
            f5.w wVar = this.d;
            lVar.a(0, 10, wVar.a);
            wVar.C(0);
            if (wVar.t() != 4801587) {
                break;
            }
            wVar.D(3);
            int q6 = wVar.q();
            i10 += q6 + 10;
            lVar.i(q6);
        }
        lVar.s();
        lVar.i(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override // o3.k
    public final int d(o3.l lVar, o3.n nVar) {
        f5.a.j(this.f);
        long j10 = ((o3.h) lVar).c;
        int i10 = this.a;
        int i11 = 4;
        if ((i10 & 1) != 0 && j10 != -1) {
            f5.v vVar = this.e;
            f5.w wVar = this.d;
            if (!this.j) {
                this.i = -1;
                o3.h hVar = (o3.h) lVar;
                hVar.f = 0;
                long j11 = 0;
                if (hVar.d == 0) {
                    a(lVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        o3.h hVar2 = (o3.h) lVar;
                        if (!hVar2.f(wVar.a, 0, 2, true)) {
                            break;
                        }
                        wVar.C(0);
                        if (!((wVar.w() & 65526) == 65520)) {
                            i12 = 0;
                            break;
                        }
                        if (!hVar2.f(wVar.a, 0, i11, true)) {
                            break;
                        }
                        vVar.p(14);
                        int i13 = vVar.i(13);
                        if (i13 <= 6) {
                            this.j = true;
                            throw t1.a("Malformed ADTS stream", null);
                        }
                        j11 += i13;
                        i12++;
                        if (i12 != 1000 && hVar2.b(i13 - 6, true)) {
                            i11 = 4;
                        }
                    } catch (EOFException unused) {
                    }
                }
                hVar.f = 0;
                if (i12 > 0) {
                    this.i = (int) (j11 / i12);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        f5.w wVar2 = this.c;
        int read = ((o3.h) lVar).read(wVar2.a, 0, 2048);
        boolean z10 = read == -1;
        boolean z11 = this.l;
        e eVar = this.b;
        if (!z11) {
            boolean z12 = (i10 & 1) != 0 && this.i > 0;
            if (!z12 || eVar.q != -9223372036854775807L || z10) {
                if (z12) {
                    long j12 = eVar.q;
                    if (j12 != -9223372036854775807L) {
                        o3.m mVar = this.f;
                        int i14 = this.i;
                        mVar.D1(new o3.g(j10, (int) ((i14 * 8000000) / j12), i14, false, this.h));
                        this.l = true;
                    }
                }
                this.f.D1(new o3.o(-9223372036854775807L));
                this.l = true;
            }
        }
        if (z10) {
            return -1;
        }
        wVar2.C(0);
        wVar2.B(read);
        if (!this.k) {
            eVar.f(4, this.g);
            this.k = true;
        }
        eVar.c(wVar2);
        return 0;
    }

    @Override // o3.k
    public final boolean e(o3.l lVar) {
        int a2 = a(lVar);
        int i10 = a2;
        int i11 = 0;
        int i12 = 0;
        do {
            f5.w wVar = this.d;
            o3.h hVar = (o3.h) lVar;
            hVar.f(wVar.a, 0, 2, false);
            wVar.C(0);
            if ((wVar.w() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.f(wVar.a, 0, 4, false);
                f5.v vVar = this.e;
                vVar.p(14);
                int i13 = vVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f = 0;
                    hVar.b(i10, false);
                } else {
                    hVar.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f = 0;
                hVar.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        this.k = false;
        this.b.a();
        this.g = j11;
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        this.f = mVar;
        this.b.e(mVar, new d0(0, 1));
        mVar.e1();
    }

    @Override // o3.k
    public final void release() {
    }
}
