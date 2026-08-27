package v3;

import d5.z;
import java.io.EOFException;
import m3.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e {
    public final f a = new f();
    public final z b = new z(new byte[65025], 0);
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

    public final boolean b(l lVar) {
        int i10;
        d5.a.i(lVar != null);
        boolean z10 = this.e;
        z zVar = this.b;
        if (z10) {
            this.e = false;
            zVar.z(0);
        }
        while (!this.e) {
            int i11 = this.c;
            f fVar = this.a;
            if (i11 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i12 = fVar.d;
                    if ((fVar.a & 1) == 1 && zVar.c == 0) {
                        i12 += a(0);
                        i10 = this.d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.t(i12);
                        this.c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.c);
            int i13 = this.c + this.d;
            if (a2 > 0) {
                zVar.b(zVar.c + a2);
                try {
                    lVar.readFully(zVar.a, zVar.c, a2);
                    zVar.B(zVar.c + a2);
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
