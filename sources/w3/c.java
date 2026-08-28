package w3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements m3.k {
    public final b a = new b(null, 1);
    public final d5.y b = new d5.y(16384);
    public boolean c;

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        d5.y yVar = this.b;
        int read = ((m3.h) lVar).read(yVar.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        yVar.C(0);
        yVar.B(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.k(4, 0L);
            this.c = true;
        }
        bVar.g(yVar);
        return 0;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.a.j(mVar, new d0(0, 1));
        mVar.B();
        mVar.y(new m3.o(-9223372036854775807L));
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
        int i9;
        d5.y yVar = new d5.y(10);
        int i10 = 0;
        while (true) {
            hVar = (m3.h) lVar;
            hVar.g(yVar.a, 0, 10, false);
            yVar.C(0);
            if (yVar.t() != 4801587) {
                break;
            }
            yVar.D(3);
            int q10 = yVar.q();
            i10 += q10 + 10;
            hVar.a(q10, false);
        }
        hVar.f = 0;
        hVar.a(i10, false);
        int i11 = i10;
        loop1: while (true) {
            int i12 = 0;
            while (true) {
                int i13 = 7;
                hVar.g(yVar.a, 0, 7, false);
                yVar.C(0);
                int w8 = yVar.w();
                if (w8 != 44096 && w8 != 44097) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = yVar.a;
                if (bArr.length < 7) {
                    i9 = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (w8 == 44097) {
                        i13 += 2;
                    }
                    i9 = i14 + i13;
                }
                if (i9 == -1) {
                    break loop1;
                }
                hVar.a(i9 - 7, false);
            }
            hVar.a(i11, false);
        }
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.c = false;
        this.a.h();
    }

    @Override // m3.k
    public final void release() {
    }
}
