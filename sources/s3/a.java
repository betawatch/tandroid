package s3;

import androidx.car.app.media.b;
import h5.d0;
import j3.m0;
import j3.n0;
import j3.r1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.telegram.ui.Components.jb;
import r3.g;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.s;
import r3.v;
import r8.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a implements k {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public final int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public m l;
    public v m;
    public s n;
    public boolean o;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i10 = d0.a;
        Charset charset = d.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    public a(int i10) {
        this.b = i10;
    }

    public final int a(l lVar) {
        boolean z4;
        lVar.r();
        byte[] bArr = this.a;
        lVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw r1.a("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z4 = this.c) && (i10 < 10 || i10 > 13)) || (!z4 && (i10 < 12 || i10 > 14)))) {
            return z4 ? q[i10] : p[i10];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i10);
        throw r1.a(sb.toString(), null);
    }

    public final boolean b(l lVar) {
        lVar.r();
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            lVar.s(bArr.length);
            return true;
        }
        lVar.r();
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        lVar.s(bArr3.length);
        return true;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j10 != 0) {
            s sVar = this.n;
            if (sVar instanceof g) {
                this.k = (Math.max(0L, j10 - ((g) sVar).b) * 8000000) / r0.e;
                return;
            }
        }
        this.k = 0L;
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.l = mVar;
        this.m = mVar.i2(0, 1);
        mVar.i1();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        int i10;
        int i11;
        h5.a.j(this.m);
        int i12 = d0.a;
        if (((h) lVar).d == 0 && !b(lVar)) {
            throw r1.a("Could not find AMR header.", null);
        }
        if (!this.o) {
            this.o = true;
            boolean z4 = this.c;
            String str = z4 ? "audio/amr-wb" : "audio/3gpp";
            int i13 = z4 ? b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            v vVar = this.m;
            m0 m0Var = new m0();
            m0Var.o = str;
            m0Var.p = t;
            m0Var.B = 1;
            m0Var.C = i13;
            vVar.b(new n0(m0Var));
        }
        if (this.f == 0) {
            try {
                int a2 = a(lVar);
                this.e = a2;
                this.f = a2;
                if (this.i == -1) {
                    this.h = ((h) lVar).d;
                    this.i = a2;
                }
                if (this.i == a2) {
                    this.j++;
                }
            } catch (EOFException unused) {
            }
        }
        int e6 = this.m.e(lVar, this.f, true);
        if (e6 != -1) {
            int i14 = this.f - e6;
            this.f = i14;
            i10 = 0;
            if (i14 <= 0) {
                this.m.c(this.k + this.d, 1, this.e, 0, null);
                this.d += 20000;
            }
            long j10 = ((h) lVar).c;
            if (!this.g) {
                if ((this.b & 1) == 0 || j10 == -1 || !((i11 = this.i) == -1 || i11 == this.e)) {
                    n nVar = new n(-9223372036854775807L);
                    this.n = nVar;
                    this.l.m2(nVar);
                    this.g = true;
                } else if (this.j >= 20 || i10 == -1) {
                    g gVar = new g(j10, (int) ((i11 * 8000000) / 20000), i11, false, this.h);
                    this.n = gVar;
                    this.l.m2(gVar);
                    this.g = true;
                }
            }
            return i10;
        }
        i10 = -1;
        long j102 = ((h) lVar).c;
        if (!this.g) {
        }
        return i10;
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        return b(lVar);
    }

    @Override // r3.k
    public final void release() {
    }
}
