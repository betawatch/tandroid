package w3;

import h3.t1;
import java.io.EOFException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements m3.k {
    public final int a;
    public final d5.y d;
    public final d5.x e;
    public m3.m f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(null, true);
    public final d5.y c = new d5.y(2048);
    public int i = -1;
    public long h = -1;

    public d(int i9) {
        this.a = i9;
        d5.y yVar = new d5.y(10);
        this.d = yVar;
        byte[] bArr = yVar.a;
        this.e = new d5.x(bArr, bArr.length);
    }

    public final int a(m3.l lVar) {
        int i9 = 0;
        while (true) {
            d5.y yVar = this.d;
            lVar.c(0, 10, yVar.a);
            yVar.C(0);
            if (yVar.t() != 4801587) {
                break;
            }
            yVar.D(3);
            int q10 = yVar.q();
            i9 += q10 + 10;
            lVar.n(q10);
        }
        lVar.t();
        lVar.n(i9);
        if (this.h == -1) {
            this.h = i9;
        }
        return i9;
    }

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        d5.a.j(this.f);
        long j10 = ((m3.h) lVar).c;
        int i9 = this.a;
        int i10 = 4;
        if ((i9 & 1) != 0 && j10 != -1) {
            d5.x xVar = this.e;
            d5.y yVar = this.d;
            if (!this.j) {
                this.i = -1;
                m3.h hVar = (m3.h) lVar;
                hVar.f = 0;
                long j11 = 0;
                if (hVar.d == 0) {
                    a(lVar);
                }
                int i11 = 0;
                while (true) {
                    try {
                        m3.h hVar2 = (m3.h) lVar;
                        if (!hVar2.g(yVar.a, 0, 2, true)) {
                            break;
                        }
                        yVar.C(0);
                        if (!((yVar.w() & 65526) == 65520)) {
                            i11 = 0;
                            break;
                        }
                        if (!hVar2.g(yVar.a, 0, i10, true)) {
                            break;
                        }
                        xVar.p(14);
                        int i12 = xVar.i(13);
                        if (i12 <= 6) {
                            this.j = true;
                            throw t1.a("Malformed ADTS stream", null);
                        }
                        j11 += i12;
                        i11++;
                        if (i11 != 1000 && hVar2.a(i12 - 6, true)) {
                            i10 = 4;
                        }
                    } catch (EOFException unused) {
                    }
                }
                hVar.f = 0;
                if (i11 > 0) {
                    this.i = (int) (j11 / i11);
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        d5.y yVar2 = this.c;
        int read = ((m3.h) lVar).read(yVar2.a, 0, 2048);
        boolean z10 = read == -1;
        boolean z11 = this.l;
        e eVar = this.b;
        if (!z11) {
            boolean z12 = (i9 & 1) != 0 && this.i > 0;
            if (!z12 || eVar.q != -9223372036854775807L || z10) {
                if (z12) {
                    long j12 = eVar.q;
                    if (j12 != -9223372036854775807L) {
                        m3.m mVar = this.f;
                        int i13 = this.i;
                        mVar.y(new m3.g(j10, (int) ((i13 * 8000000) / j12), i13, false, this.h));
                        this.l = true;
                    }
                }
                this.f.y(new m3.o(-9223372036854775807L));
                this.l = true;
            }
        }
        if (z10) {
            return -1;
        }
        yVar2.C(0);
        yVar2.B(read);
        if (!this.k) {
            eVar.k(4, this.g);
            this.k = true;
        }
        eVar.g(yVar2);
        return 0;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.f = mVar;
        this.b.j(mVar, new d0(0, 1));
        mVar.B();
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        int a2 = a(lVar);
        int i9 = a2;
        int i10 = 0;
        int i11 = 0;
        do {
            d5.y yVar = this.d;
            m3.h hVar = (m3.h) lVar;
            hVar.g(yVar.a, 0, 2, false);
            yVar.C(0);
            if ((yVar.w() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                hVar.g(yVar.a, 0, 4, false);
                d5.x xVar = this.e;
                xVar.p(14);
                int i12 = xVar.i(13);
                if (i12 <= 6) {
                    i9++;
                    hVar.f = 0;
                    hVar.a(i9, false);
                } else {
                    hVar.a(i12 - 6, false);
                    i11 += i12;
                }
            } else {
                i9++;
                hVar.f = 0;
                hVar.a(i9, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i9 - a2 < 8192);
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.k = false;
        this.b.h();
        this.g = j11;
    }

    @Override // m3.k
    public final void release() {
    }
}
