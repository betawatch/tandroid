package y3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements o3.k {
    public final b a = new b(null, 1);
    public final f5.w b = new f5.w(16384);
    public boolean c;

    @Override // o3.k
    public final int d(o3.l lVar, o3.n nVar) {
        f5.w wVar = this.b;
        int read = ((o3.h) lVar).read(wVar.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        wVar.C(0);
        wVar.B(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.f(4, 0L);
            this.c = true;
        }
        bVar.c(wVar);
        return 0;
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
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(o3.l lVar) {
        o3.h hVar;
        int i10;
        f5.w wVar = new f5.w(10);
        int i11 = 0;
        while (true) {
            hVar = (o3.h) lVar;
            hVar.f(wVar.a, 0, 10, false);
            wVar.C(0);
            if (wVar.t() != 4801587) {
                break;
            }
            wVar.D(3);
            int q6 = wVar.q();
            i11 += q6 + 10;
            hVar.b(q6, false);
        }
        hVar.f = 0;
        hVar.b(i11, false);
        int i12 = i11;
        loop1: while (true) {
            int i13 = 0;
            while (true) {
                int i14 = 7;
                hVar.f(wVar.a, 0, 7, false);
                wVar.C(0);
                int w10 = wVar.w();
                if (w10 != 44096 && w10 != 44097) {
                    break;
                }
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.a;
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
                hVar.b(i10 - 7, false);
            }
            hVar.b(i12, false);
        }
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        this.c = false;
        this.a.a();
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        this.a.e(mVar, new d0(0, 1));
        mVar.e1();
        mVar.D1(new o3.o(-9223372036854775807L));
    }

    @Override // o3.k
    public final void release() {
    }
}
