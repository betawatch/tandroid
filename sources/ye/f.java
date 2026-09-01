package ye;

import j3.u1;
import java.io.EOFException;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public f(s5.m mVar) {
        byte b10;
        byte b11;
        ze.a aVar = (ze.a) mVar.b;
        long j10 = aVar.b;
        ai aiVar = (ai) mVar.d;
        h hVar = (h) mVar.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            aiVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) aiVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            aiVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) aiVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.e = ((aiVar.S() & 255) << 16) | ((aiVar.S() & 255) << 8) | (aiVar.S() & 255);
        } else if (i11 == 3) {
            this.e = aiVar.Y();
        } else {
            this.e = aiVar.Z();
        }
        if (i11 > 2) {
            aiVar.S();
            byte S = aiVar.S();
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
            boolean z4 = (b13 & S) != 0;
            this.d = z4;
            this.b = (b12 & S) != 0;
            boolean z10 = (S & b14) != 0;
            this.f = z10;
            if (i11 == 3) {
                if (z4) {
                    this.g = aiVar.Y();
                    this.e -= 4;
                }
                if (z10) {
                    aiVar.S();
                    this.e--;
                }
                if ((S & b10) != 0) {
                    aiVar.S();
                    this.e--;
                }
            } else {
                if ((S & b10) != 0) {
                    aiVar.S();
                    this.e--;
                }
                if (z10) {
                    aiVar.S();
                    this.e--;
                }
                if ((S & b11) != 0) {
                    this.g = aiVar.Z();
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

    public f(u1 u1Var) {
        this.h = u1Var;
    }
}
