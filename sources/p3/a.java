package p3;

import m3.c;
import m3.d;
import m3.e;
import m3.l;
import m3.n;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public final m3.a a;
    public final e b;
    public m3.b c;
    public final int d;

    public a(c cVar, e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.b = eVar;
        this.d = i10;
        this.a = new m3.a(cVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(l lVar, long j10, n nVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        nVar.a = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        return c(r27, r8, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        while (true) {
            m3.b bVar = this.c;
            d5.a.j(bVar);
            long j10 = bVar.f;
            long j11 = bVar.g;
            long j12 = bVar.h;
            long j13 = j11 - j10;
            long j14 = this.d;
            e eVar = this.b;
            if (j13 <= j14) {
                this.c = null;
                eVar.f2();
                return c(lVar, j10, nVar);
            }
            long position = j12 - lVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            lVar.t((int) position);
            lVar.q();
            d P1 = eVar.P1(lVar, bVar.b);
            int i10 = P1.a;
            long j15 = P1.b;
            long j16 = P1.c;
            if (i10 == -3) {
                this.c = null;
                eVar.f2();
                return c(lVar, j12, nVar);
            }
            if (i10 == -2) {
                bVar.d = j15;
                bVar.f = j16;
                bVar.h = m3.b.a(bVar.b, j15, bVar.e, j16, bVar.g, bVar.c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j16 - lVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        lVar.t((int) position2);
                    }
                    this.c = null;
                    eVar.f2();
                    return c(lVar, j16, nVar);
                }
                bVar.e = j15;
                bVar.g = j16;
                bVar.h = m3.b.a(bVar.b, bVar.d, j15, bVar.f, j16, bVar.c);
            }
        }
    }

    public final void d(long j10) {
        m3.b bVar = this.c;
        if (bVar == null || bVar.a != j10) {
            m3.a aVar = this.a;
            this.c = new m3.b(j10, aVar.a.B(j10), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }
}
