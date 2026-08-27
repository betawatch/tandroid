package w3;

import h3.t1;
import java.io.EOFException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements m3.k {
    public final int a;
    public final d5.z d;
    public final d5.y e;
    public m3.m f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final e b = new e(null, true);
    public final d5.z c = new d5.z(2048);
    public int i = -1;
    public long h = -1;

    public d(int i10) {
        this.a = i10;
        d5.z zVar = new d5.z(10);
        this.d = zVar;
        byte[] bArr = zVar.a;
        this.e = new d5.y(bArr, bArr.length);
    }

    public final int a(m3.l lVar) {
        int i10 = 0;
        while (true) {
            d5.z zVar = this.d;
            lVar.b(0, 10, zVar.a);
            zVar.C(0);
            if (zVar.t() != 4801587) {
                break;
            }
            zVar.D(3);
            int q6 = zVar.q();
            i10 += q6 + 10;
            lVar.j(q6);
        }
        lVar.q();
        lVar.j(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        d5.a.j(this.f);
        long j10 = ((m3.h) lVar).c;
        int i10 = this.a;
        int i11 = 4;
        if ((i10 & 1) != 0 && j10 != -1) {
            d5.y yVar = this.e;
            d5.z zVar = this.d;
            if (!this.j) {
                this.i = -1;
                m3.h hVar = (m3.h) lVar;
                hVar.f = 0;
                long j11 = 0;
                if (hVar.d == 0) {
                    a(lVar);
                }
                int i12 = 0;
                while (true) {
                    try {
                        m3.h hVar2 = (m3.h) lVar;
                        if (!hVar2.g(zVar.a, 0, 2, true)) {
                            break;
                        }
                        zVar.C(0);
                        if (!((zVar.w() & 65526) == 65520)) {
                            i12 = 0;
                            break;
                        }
                        if (!hVar2.g(zVar.a, 0, i11, true)) {
                            break;
                        }
                        yVar.p(14);
                        int i13 = yVar.i(13);
                        if (i13 <= 6) {
                            this.j = true;
                            throw t1.a("Malformed ADTS stream", null);
                        }
                        j11 += i13;
                        i12++;
                        if (i12 != 1000 && hVar2.a(i13 - 6, true)) {
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
        d5.z zVar2 = this.c;
        int read = ((m3.h) lVar).read(zVar2.a, 0, 2048);
        boolean z10 = read == -1;
        boolean z11 = this.l;
        e eVar = this.b;
        if (!z11) {
            boolean z12 = (i10 & 1) != 0 && this.i > 0;
            if (!z12 || eVar.q != -9223372036854775807L || z10) {
                if (z12) {
                    long j12 = eVar.q;
                    if (j12 != -9223372036854775807L) {
                        m3.m mVar = this.f;
                        int i14 = this.i;
                        mVar.n(new m3.g(j10, (int) ((i14 * 8000000) / j12), i14, false, this.h));
                        this.l = true;
                    }
                }
                this.f.n(new m3.o(-9223372036854775807L));
                this.l = true;
            }
        }
        if (z10) {
            return -1;
        }
        zVar2.C(0);
        zVar2.B(read);
        if (!this.k) {
            eVar.f(4, this.g);
            this.k = true;
        }
        eVar.b(zVar2);
        return 0;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.f = mVar;
        this.b.e(mVar, new e0(0, 1));
        mVar.A();
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        int a2 = a(lVar);
        int i10 = a2;
        int i11 = 0;
        int i12 = 0;
        do {
            d5.z zVar = this.d;
            m3.h hVar = (m3.h) lVar;
            hVar.g(zVar.a, 0, 2, false);
            zVar.C(0);
            if ((zVar.w() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.g(zVar.a, 0, 4, false);
                d5.y yVar = this.e;
                yVar.p(14);
                int i13 = yVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f = 0;
                    hVar.a(i10, false);
                } else {
                    hVar.a(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f = 0;
                hVar.a(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.k = false;
        this.b.c();
        this.g = j11;
    }

    @Override // m3.k
    public final void release() {
    }
}
