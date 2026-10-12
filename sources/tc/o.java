package tc;

import c5.c0;
import e2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public c0 d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean n10;
        boolean z10;
        int i10;
        int i11;
        c0 c0Var = new c0(bArr.length + 1, 10);
        c0Var.r(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            n10 = c0Var.n(iArr[0]);
            int i12 = iArr[0];
            iArr[0] = i12 + 1;
            if (n10) {
                int i13 = i12 / 8;
                ((ByteBuffer) c0Var.c).put(i13, (byte) ((~(1 << (i12 % 8))) & c0Var.l(i13)));
            }
            int s10 = c0Var.s(2, iArr);
            if (s10 == 0) {
                int i14 = ((iArr[0] + 7) & (-8)) / 8;
                int l4 = ((255 & c0Var.l(i14 + 1)) * 256) + (c0Var.l(i14) & 255);
                iArr[0] = (i14 + 4 + l4) * 8;
                if (l4 == 0) {
                    z10 = true;
                    i10 = c0Var.b;
                    i11 = iArr[0];
                    if (i10 <= i11 / 8) {
                        n10 = true;
                    }
                    if (n10 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (s10 == 1) {
                g gVar = g.f;
                f fVar = f.f;
                while (true) {
                    int k10 = gVar.k(c0Var, iArr);
                    if (k10 == 256) {
                        break;
                    }
                    if (k10 < 0 || k10 > 255) {
                        d.f(c0Var, iArr, k10);
                        d.d(c0Var, iArr, fVar);
                    }
                }
            } else {
                if (s10 != 2) {
                    throw new com.google.firebase.messaging.r(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(c0Var, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int k11 = j0Var.k(c0Var, iArr);
                    if (k11 == 256) {
                        break;
                    }
                    if (k11 < 0 || k11 > 255) {
                        d.f(c0Var, iArr, k11);
                        d.d(c0Var, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i10 = c0Var.b;
            i11 = iArr[0];
            if (i10 <= i11 / 8) {
            }
            if (n10) {
                zArr[0] = true;
            }
        } while (!n10);
        if (zArr[0]) {
            return c0Var.w(0, i2.d.z(i11, 1, 8, -3));
        }
        int i15 = i11 % 8;
        if (i15 == 0 || i15 == 6 || i15 == 7) {
            c0Var.p(0);
        }
        int i16 = iArr[0];
        iArr[0] = i16 + 3;
        return c0Var.w(0, ((i16 + 2) / 8) + 1);
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.c;
        if (i10 != 32768 && bArr.length >= i10) {
            return bArr;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Deflater deflater = new Deflater(-1, true);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr, 0, bArr.length);
            deflaterOutputStream.close();
            deflater.end();
            return a(byteArrayOutputStream.toByteArray());
        } catch (Exception e7) {
            throw new v(42, t8.b.h("Failed to compress the message: ", e7.getMessage()), e7);
        }
    }

    public final byte[] c(byte[] bArr) {
        c0 c0Var = new c0(bArr.length + 4, 10);
        c0Var.r(bArr);
        c0Var.r(e);
        if (this.d == null) {
            this.d = new c0(0, 10);
        }
        c0 c0Var2 = this.d;
        int i10 = c0Var2.b;
        try {
            c.a(c0Var, c0Var2);
            c0 c0Var3 = this.d;
            byte[] w9 = c0Var3.w(i10, c0Var3.b);
            c0 c0Var4 = this.d;
            if (((ByteBuffer) c0Var4.c).capacity() > 0) {
                int i11 = c0Var4.b;
                byte[] w10 = c0Var4.w(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(w10);
                c0Var4.c = wrap;
                wrap.position(w10.length);
                c0Var4.b = w10.length;
            }
            return w9;
        } catch (Exception e7) {
            throw new v(43, t8.b.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
