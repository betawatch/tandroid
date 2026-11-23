package tf;

import java.io.EOFException;
import org.telegram.ui.Components.jn;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(md0 md0Var) {
        byte b10;
        byte b11;
        uf.a aVar = (uf.a) md0Var.b;
        long j3 = aVar.b;
        jn jnVar = (jn) md0Var.d;
        h hVar = (h) md0Var.c;
        int i7 = hVar.a;
        int i10 = hVar.a;
        byte b12 = 2;
        if (i7 == 2) {
            jnVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) jnVar.b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            jnVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) jnVar.b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.c = ((jnVar.Q() & 255) << 16) | ((jnVar.Q() & 255) << 8) | (jnVar.Q() & 255);
        } else if (i10 == 3) {
            this.c = jnVar.R();
        } else {
            this.c = jnVar.S();
        }
        if (i10 > 2) {
            jnVar.Q();
            byte Q = jnVar.Q();
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
                    this.g = jnVar.R();
                    this.c -= 4;
                }
                if (z11) {
                    jnVar.Q();
                    this.c--;
                }
                if ((Q & b10) != 0) {
                    jnVar.Q();
                    this.c--;
                }
            } else {
                if ((Q & b10) != 0) {
                    jnVar.Q();
                    this.c--;
                }
                if (z11) {
                    jnVar.Q();
                    this.c--;
                }
                if ((Q & b11) != 0) {
                    this.g = jnVar.S();
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
