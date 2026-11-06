package tf;

import java.io.EOFException;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(hy0 hy0Var) {
        byte b10;
        byte b11;
        uf.a aVar = (uf.a) hy0Var.b;
        long j3 = aVar.b;
        uy uyVar = (uy) hy0Var.d;
        h hVar = (h) hy0Var.c;
        int i7 = hVar.a;
        int i10 = hVar.a;
        byte b12 = 2;
        if (i7 == 2) {
            uyVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) uyVar.b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            uyVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) uyVar.b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.c = ((uyVar.M() & 255) << 16) | ((uyVar.M() & 255) << 8) | (uyVar.M() & 255);
        } else if (i10 == 3) {
            this.c = uyVar.O();
        } else {
            this.c = uyVar.P();
        }
        if (i10 > 2) {
            uyVar.M();
            byte M = uyVar.M();
            byte b14 = 64;
            if (i10 == 3) {
                b13 = 128;
                b11 = 0;
                b10 = 32;
                b12 = 0;
            } else {
                b10 = 64;
                b11 = 1;
                b14 = 4;
            }
            boolean z9 = (b13 & M) != 0;
            this.e = z9;
            this.d = (b12 & M) != 0;
            boolean z10 = (M & b14) != 0;
            this.f = z10;
            if (i10 == 3) {
                if (z9) {
                    this.g = uyVar.O();
                    this.c -= 4;
                }
                if (z10) {
                    uyVar.M();
                    this.c--;
                }
                if ((M & b10) != 0) {
                    uyVar.M();
                    this.c--;
                }
            } else {
                if ((M & b10) != 0) {
                    uyVar.M();
                    this.c--;
                }
                if (z10) {
                    uyVar.M();
                    this.c--;
                }
                if ((M & b11) != 0) {
                    this.g = uyVar.P();
                    this.c -= 4;
                }
            }
        }
        this.b = (int) (aVar.b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
