package r3;

import o3.c;
import o3.d;
import o3.e;
import o3.l;
import o3.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public final o3.a a;
    public final e b;
    public o3.b c;
    public final int d;

    public a(c cVar, e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.b = eVar;
        this.d = i10;
        this.a = new o3.a(cVar, j10, j11, j12, j13, j14);
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
            o3.b bVar = this.c;
            f5.a.j(bVar);
            long j10 = bVar.f;
            long j11 = bVar.g;
            long j12 = bVar.h;
            long j13 = j11 - j10;
            long j14 = this.d;
            e eVar = this.b;
            if (j13 <= j14) {
                this.c = null;
                eVar.f();
                return c(lVar, j10, nVar);
            }
            long position = j12 - lVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            lVar.t((int) position);
            lVar.s();
            d d = eVar.d(lVar, bVar.b);
            int i10 = d.a;
            long j15 = d.b;
            long j16 = d.c;
            if (i10 == -3) {
                this.c = null;
                eVar.f();
                return c(lVar, j12, nVar);
            }
            if (i10 == -2) {
                bVar.d = j15;
                bVar.f = j16;
                bVar.h = o3.b.a(bVar.b, j15, bVar.e, j16, bVar.g, bVar.c);
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
                    eVar.f();
                    return c(lVar, j16, nVar);
                }
                bVar.e = j15;
                bVar.g = j16;
                bVar.h = o3.b.a(bVar.b, bVar.d, j15, bVar.f, j16, bVar.c);
            }
        }
    }

    public final void d(long j10) {
        o3.b bVar = this.c;
        if (bVar == null || bVar.a != j10) {
            o3.a aVar = this.a;
            this.c = new o3.b(j10, aVar.a.l(j10), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }
}
