package z3;

import b8.zb;
import e3.p;
import g2.y;
import java.io.EOFException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final f a = new f();
    public final y b = new y(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i3) {
        int i10;
        int i11 = 0;
        this.d = 0;
        do {
            int i12 = this.d;
            int i13 = i3 + i12;
            f fVar = this.a;
            if (i13 >= fVar.c) {
                break;
            }
            int[] iArr = fVar.f;
            this.d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(p pVar) {
        int i3;
        zb.p(pVar != null);
        boolean z10 = this.e;
        y yVar = this.b;
        if (z10) {
            this.e = false;
            yVar.K(0);
        }
        while (!this.e) {
            int i10 = this.c;
            f fVar = this.a;
            if (i10 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i11 = fVar.d;
                    if ((fVar.a & 1) == 1 && yVar.c == 0) {
                        i11 += a(0);
                        i3 = this.d;
                    } else {
                        i3 = 0;
                    }
                    try {
                        pVar.u(i11);
                        this.c = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a10 = a(this.c);
            int i12 = this.c + this.d;
            if (a10 > 0) {
                yVar.c(yVar.c + a10);
                try {
                    pVar.readFully(yVar.a, yVar.c, a10);
                    yVar.M(yVar.c + a10);
                    this.e = fVar.f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.c) {
                i12 = -1;
            }
            this.c = i12;
        }
        return true;
    }
}
