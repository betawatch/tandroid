package tf;

import java.io.EOFException;
import org.telegram.messenger.ou;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(ld0 ld0Var) {
        byte b10;
        byte b11;
        uf.a aVar = (uf.a) ld0Var.b;
        long j3 = aVar.b;
        ou ouVar = (ou) ld0Var.d;
        h hVar = (h) ld0Var.c;
        int i7 = hVar.a;
        int i10 = hVar.a;
        byte b12 = 2;
        if (i7 == 2) {
            ouVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) ouVar.b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            ouVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) ouVar.b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.c = ((ouVar.g1() & 255) << 16) | ((ouVar.g1() & 255) << 8) | (ouVar.g1() & 255);
        } else if (i10 == 3) {
            this.c = ouVar.h1();
        } else {
            this.c = ouVar.j1();
        }
        if (i10 > 2) {
            ouVar.g1();
            byte g12 = ouVar.g1();
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
            boolean z10 = (b13 & g12) != 0;
            this.e = z10;
            this.d = (b12 & g12) != 0;
            boolean z11 = (g12 & b14) != 0;
            this.f = z11;
            if (i10 == 3) {
                if (z10) {
                    this.g = ouVar.h1();
                    this.c -= 4;
                }
                if (z11) {
                    ouVar.g1();
                    this.c--;
                }
                if ((g12 & b10) != 0) {
                    ouVar.g1();
                    this.c--;
                }
            } else {
                if ((g12 & b10) != 0) {
                    ouVar.g1();
                    this.c--;
                }
                if (z11) {
                    ouVar.g1();
                    this.c--;
                }
                if ((g12 & b11) != 0) {
                    this.g = ouVar.j1();
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
