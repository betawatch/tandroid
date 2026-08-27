package ue;

import h3.w1;
import java.io.EOFException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public Object h;

    public f(u2.b bVar) {
        byte b10;
        byte b11;
        ve.a aVar = (ve.a) bVar.c;
        long j10 = aVar.b;
        n1.d dVar = (n1.d) bVar.b;
        h hVar = (h) bVar.d;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            dVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) dVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            dVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) dVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.e = ((dVar.a0() & 255) << 16) | ((dVar.a0() & 255) << 8) | (dVar.a0() & 255);
        } else if (i11 == 3) {
            this.e = dVar.g0();
        } else {
            this.e = dVar.n0();
        }
        if (i11 > 2) {
            dVar.a0();
            byte a02 = dVar.a0();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b12 = 0;
                b10 = 32;
                b11 = 0;
            } else {
                b14 = 4;
                b10 = 64;
                b11 = 1;
            }
            boolean z10 = (b13 & a02) != 0;
            this.d = z10;
            this.b = (b12 & a02) != 0;
            boolean z11 = (a02 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = dVar.g0();
                    this.e -= 4;
                }
                if (z11) {
                    dVar.a0();
                    this.e--;
                }
                if ((a02 & b10) != 0) {
                    dVar.a0();
                    this.e--;
                }
            } else {
                if ((a02 & b10) != 0) {
                    dVar.a0();
                    this.e--;
                }
                if (z11) {
                    dVar.a0();
                    this.e--;
                }
                if ((a02 & b11) != 0) {
                    this.g = dVar.n0();
                    this.e -= 4;
                }
            }
        }
        this.c = (int) (aVar.b - j10);
    }

    public void a(int i10) {
        this.b |= i10 > 0;
        this.c += i10;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), (String) this.h, Integer.valueOf(this.e));
            default:
                return super.toString();
        }
    }

    public f(w1 w1Var) {
        this.h = w1Var;
    }
}
