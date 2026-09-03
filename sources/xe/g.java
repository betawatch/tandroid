package xe;

import j3.u1;
import java.io.EOFException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public Object h;

    public g(s5.m mVar) {
        byte b10;
        byte b11;
        ye.a aVar = (ye.a) mVar.b;
        long j10 = aVar.b;
        b bVar = (b) mVar.d;
        i iVar = (i) mVar.c;
        int i10 = iVar.a;
        int i11 = iVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            bVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) bVar.a).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            bVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) bVar.a).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.e = ((bVar.a() & 255) << 16) | ((bVar.a() & 255) << 8) | (bVar.a() & 255);
        } else if (i11 == 3) {
            this.e = bVar.b();
        } else {
            this.e = bVar.c();
        }
        if (i11 > 2) {
            bVar.a();
            byte a2 = bVar.a();
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
            boolean z4 = (b13 & a2) != 0;
            this.d = z4;
            this.b = (b12 & a2) != 0;
            boolean z10 = (a2 & b14) != 0;
            this.f = z10;
            if (i11 == 3) {
                if (z4) {
                    this.g = bVar.b();
                    this.e -= 4;
                }
                if (z10) {
                    bVar.a();
                    this.e--;
                }
                if ((a2 & b10) != 0) {
                    bVar.a();
                    this.e--;
                }
            } else {
                if ((a2 & b10) != 0) {
                    bVar.a();
                    this.e--;
                }
                if (z10) {
                    bVar.a();
                    this.e--;
                }
                if ((a2 & b11) != 0) {
                    this.g = bVar.c();
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
                return String.format("%s[id=%s, bodysize=%d]", g.class.getSimpleName(), (String) this.h, Integer.valueOf(this.e));
            default:
                return super.toString();
        }
    }

    public g(u1 u1Var) {
        this.h = u1Var;
    }
}
