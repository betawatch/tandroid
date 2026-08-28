package v3;

import d5.y;
import java.io.EOFException;
import m3.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public final f a = new f();
    public final y b = new y(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i9) {
        int i10;
        int i11 = 0;
        this.d = 0;
        do {
            int i12 = this.d;
            int i13 = i9 + i12;
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

    public final boolean b(l lVar) {
        int i9;
        d5.a.i(lVar != null);
        boolean z10 = this.e;
        y yVar = this.b;
        if (z10) {
            this.e = false;
            yVar.z(0);
        }
        while (!this.e) {
            int i10 = this.c;
            f fVar = this.a;
            if (i10 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i11 = fVar.d;
                    if ((fVar.a & 1) == 1 && yVar.c == 0) {
                        i11 += a(0);
                        i9 = this.d;
                    } else {
                        i9 = 0;
                    }
                    try {
                        lVar.u(i11);
                        this.c = i9;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.c);
            int i12 = this.c + this.d;
            if (a2 > 0) {
                yVar.b(yVar.c + a2);
                try {
                    lVar.readFully(yVar.a, yVar.c, a2);
                    yVar.B(yVar.c + a2);
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
