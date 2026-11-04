package qf;

import java.io.EOFException;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(p7.d dVar) {
        byte b10;
        byte b11;
        rf.b bVar = (rf.b) dVar.b;
        long j10 = bVar.b;
        nh nhVar = (nh) dVar.c;
        h hVar = (h) dVar.d;
        int i3 = hVar.a;
        int i10 = hVar.a;
        byte b12 = 2;
        if (i3 == 2) {
            nhVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((rf.a) nhVar.b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            nhVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((rf.a) nhVar.b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.c = ((nhVar.F() & 255) << 16) | ((nhVar.F() & 255) << 8) | (nhVar.F() & 255);
        } else if (i10 == 3) {
            this.c = nhVar.G();
        } else {
            this.c = nhVar.H();
        }
        if (i10 > 2) {
            nhVar.F();
            byte F = nhVar.F();
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
            boolean z10 = (b13 & F) != 0;
            this.e = z10;
            this.d = (b12 & F) != 0;
            boolean z11 = (F & b14) != 0;
            this.f = z11;
            if (i10 == 3) {
                if (z10) {
                    this.g = nhVar.G();
                    this.c -= 4;
                }
                if (z11) {
                    nhVar.F();
                    this.c--;
                }
                if ((F & b10) != 0) {
                    nhVar.F();
                    this.c--;
                }
            } else {
                if ((F & b10) != 0) {
                    nhVar.F();
                    this.c--;
                }
                if (z11) {
                    nhVar.F();
                    this.c--;
                }
                if ((F & b11) != 0) {
                    this.g = nhVar.H();
                    this.c -= 4;
                }
            }
        }
        this.b = (int) (bVar.b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
