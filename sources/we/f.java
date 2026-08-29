package we;

import j3.w1;
import java.io.EOFException;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public f(v5.c cVar) {
        byte b10;
        byte b11;
        xe.a aVar = (xe.a) cVar.b;
        long j10 = aVar.b;
        n nVar = (n) cVar.d;
        h hVar = (h) cVar.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            nVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) nVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            nVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) nVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.e = ((nVar.o() & 255) << 16) | ((nVar.o() & 255) << 8) | (nVar.o() & 255);
        } else if (i11 == 3) {
            this.e = nVar.p();
        } else {
            this.e = nVar.r();
        }
        if (i11 > 2) {
            nVar.o();
            byte o10 = nVar.o();
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
            boolean z10 = (b13 & o10) != 0;
            this.d = z10;
            this.b = (b12 & o10) != 0;
            boolean z11 = (o10 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = nVar.p();
                    this.e -= 4;
                }
                if (z11) {
                    nVar.o();
                    this.e--;
                }
                if ((o10 & b10) != 0) {
                    nVar.o();
                    this.e--;
                }
            } else {
                if ((o10 & b10) != 0) {
                    nVar.o();
                    this.e--;
                }
                if (z11) {
                    nVar.o();
                    this.e--;
                }
                if ((o10 & b11) != 0) {
                    this.g = nVar.r();
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
