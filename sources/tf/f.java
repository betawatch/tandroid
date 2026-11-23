package tf;

import java.io.EOFException;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(i61 i61Var) {
        byte b10;
        byte b11;
        uf.a aVar = (uf.a) i61Var.b;
        long j3 = aVar.b;
        nd0 nd0Var = (nd0) i61Var.d;
        h hVar = (h) i61Var.c;
        int i7 = hVar.a;
        int i10 = hVar.a;
        byte b12 = 2;
        if (i7 == 2) {
            nd0Var.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) nd0Var.b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            nd0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) nd0Var.b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.c = ((nd0Var.v() & 255) << 16) | ((nd0Var.v() & 255) << 8) | (nd0Var.v() & 255);
        } else if (i10 == 3) {
            this.c = nd0Var.y();
        } else {
            this.c = nd0Var.A();
        }
        if (i10 > 2) {
            nd0Var.v();
            byte v = nd0Var.v();
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
            boolean z10 = (b13 & v) != 0;
            this.e = z10;
            this.d = (b12 & v) != 0;
            boolean z11 = (v & b14) != 0;
            this.f = z11;
            if (i10 == 3) {
                if (z10) {
                    this.g = nd0Var.y();
                    this.c -= 4;
                }
                if (z11) {
                    nd0Var.v();
                    this.c--;
                }
                if ((v & b10) != 0) {
                    nd0Var.v();
                    this.c--;
                }
            } else {
                if ((v & b10) != 0) {
                    nd0Var.v();
                    this.c--;
                }
                if (z11) {
                    nd0Var.v();
                    this.c--;
                }
                if ((v & b11) != 0) {
                    this.g = nd0Var.A();
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
