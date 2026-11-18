package tf;

import java.io.EOFException;
import org.telegram.ui.Components.hn;
import org.telegram.ui.nd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(nd0 nd0Var) {
        byte b10;
        byte b11;
        uf.a aVar = (uf.a) nd0Var.b;
        long j3 = aVar.b;
        hn hnVar = (hn) nd0Var.d;
        h hVar = (h) nd0Var.c;
        int i7 = hVar.a;
        int i10 = hVar.a;
        byte b12 = 2;
        if (i7 == 2) {
            hnVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) hnVar.b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            hnVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) hnVar.b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.c = ((hnVar.Q() & 255) << 16) | ((hnVar.Q() & 255) << 8) | (hnVar.Q() & 255);
        } else if (i10 == 3) {
            this.c = hnVar.R();
        } else {
            this.c = hnVar.S();
        }
        if (i10 > 2) {
            hnVar.Q();
            byte Q = hnVar.Q();
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
            boolean z10 = (b13 & Q) != 0;
            this.e = z10;
            this.d = (b12 & Q) != 0;
            boolean z11 = (Q & b14) != 0;
            this.f = z11;
            if (i10 == 3) {
                if (z10) {
                    this.g = hnVar.R();
                    this.c -= 4;
                }
                if (z11) {
                    hnVar.Q();
                    this.c--;
                }
                if ((Q & b10) != 0) {
                    hnVar.Q();
                    this.c--;
                }
            } else {
                if ((Q & b10) != 0) {
                    hnVar.Q();
                    this.c--;
                }
                if (z11) {
                    hnVar.Q();
                    this.c--;
                }
                if ((Q & b11) != 0) {
                    this.g = hnVar.S();
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
