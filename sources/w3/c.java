package w3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements m3.k {
    public final b a = new b(null, 1);
    public final d5.z b = new d5.z(16384);
    public boolean c;

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        d5.z zVar = this.b;
        int read = ((m3.h) lVar).read(zVar.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        zVar.C(0);
        zVar.B(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.f(4, 0L);
            this.c = true;
        }
        bVar.b(zVar);
        return 0;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.a.e(mVar, new e0(0, 1));
        mVar.A();
        mVar.n(new m3.o(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r5.f = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return false;
     */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(m3.l lVar) {
        m3.h hVar;
        int i10;
        d5.z zVar = new d5.z(10);
        int i11 = 0;
        while (true) {
            hVar = (m3.h) lVar;
            hVar.g(zVar.a, 0, 10, false);
            zVar.C(0);
            if (zVar.t() != 4801587) {
                break;
            }
            zVar.D(3);
            int q6 = zVar.q();
            i11 += q6 + 10;
            hVar.a(q6, false);
        }
        hVar.f = 0;
        hVar.a(i11, false);
        int i12 = i11;
        loop1: while (true) {
            int i13 = 0;
            while (true) {
                int i14 = 7;
                hVar.g(zVar.a, 0, 7, false);
                zVar.C(0);
                int w10 = zVar.w();
                if (w10 != 44096 && w10 != 44097) {
                    break;
                }
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (w10 == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break loop1;
                }
                hVar.a(i10 - 7, false);
            }
            hVar.a(i12, false);
        }
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.c = false;
        this.a.c();
    }

    @Override // m3.k
    public final void release() {
    }
}
