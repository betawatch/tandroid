package x3;

import c3.p;
import e2.x;
import java.io.EOFException;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class e {
    public final f a = new f();
    public final x b = new x(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.d = 0;
        do {
            int i13 = this.d;
            int i14 = i10 + i13;
            f fVar = this.a;
            if (i14 >= fVar.c) {
                break;
            }
            int[] iArr = fVar.f;
            this.d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(p pVar) {
        int i10;
        u6.p(pVar != null);
        boolean z10 = this.e;
        x xVar = this.b;
        if (z10) {
            this.e = false;
            xVar.K(0);
        }
        while (!this.e) {
            int i11 = this.c;
            f fVar = this.a;
            if (i11 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.a & 1) == 1 && xVar.c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        pVar.r(i12);
                        this.c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.c);
            int i13 = this.c + this.d;
            if (a2 > 0) {
                xVar.c(xVar.c + a2);
                try {
                    pVar.readFully(xVar.a, xVar.c, a2);
                    xVar.M(xVar.c + a2);
                    this.e = fVar.f[i13 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == fVar.c) {
                i13 = -1;
            }
            this.c = i13;
        }
        return true;
    }
}
