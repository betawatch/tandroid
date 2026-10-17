package tc;

import c5.b0;
import e2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public b0 d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean n10;
        boolean z10;
        int i10;
        int i11;
        b0 b0Var = new b0(bArr.length + 1, 10);
        b0Var.q(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            n10 = b0Var.n(iArr[0]);
            int i12 = iArr[0];
            iArr[0] = i12 + 1;
            if (n10) {
                int i13 = i12 / 8;
                ((ByteBuffer) b0Var.c).put(i13, (byte) ((~(1 << (i12 % 8))) & b0Var.l(i13)));
            }
            int r10 = b0Var.r(2, iArr);
            if (r10 == 0) {
                int i14 = ((iArr[0] + 7) & (-8)) / 8;
                int l4 = ((255 & b0Var.l(i14 + 1)) * 256) + (b0Var.l(i14) & 255);
                iArr[0] = (i14 + 4 + l4) * 8;
                if (l4 == 0) {
                    z10 = true;
                    i10 = b0Var.b;
                    i11 = iArr[0];
                    if (i10 <= i11 / 8) {
                        n10 = true;
                    }
                    if (n10 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (r10 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int i15 = gVar.i(b0Var, iArr);
                    if (i15 == 256) {
                        break;
                    }
                    if (i15 < 0 || i15 > 255) {
                        d.f(b0Var, iArr, i15);
                        d.d(b0Var, iArr, fVar);
                    }
                }
            } else {
                if (r10 != 2) {
                    throw new com.google.firebase.messaging.q(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(b0Var, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int i16 = j0Var.i(b0Var, iArr);
                    if (i16 == 256) {
                        break;
                    }
                    if (i16 < 0 || i16 > 255) {
                        d.f(b0Var, iArr, i16);
                        d.d(b0Var, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i10 = b0Var.b;
            i11 = iArr[0];
            if (i10 <= i11 / 8) {
            }
            if (n10) {
                zArr[0] = true;
            }
        } while (!n10);
        if (zArr[0]) {
            return b0Var.w(0, i0.a.C(i11, 1, 8, -3));
        }
        int i17 = i11 % 8;
        if (i17 == 0 || i17 == 6 || i17 == 7) {
            b0Var.p(0);
        }
        int i18 = iArr[0];
        iArr[0] = i18 + 3;
        return b0Var.w(0, ((i18 + 2) / 8) + 1);
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
            throw new v(42, r.c.g("Failed to compress the message: ", e7.getMessage()), e7);
        }
    }

    public final byte[] c(byte[] bArr) {
        b0 b0Var = new b0(bArr.length + 4, 10);
        b0Var.q(bArr);
        b0Var.q(e);
        if (this.d == null) {
            this.d = new b0(0, 10);
        }
        b0 b0Var2 = this.d;
        int i10 = b0Var2.b;
        try {
            c.a(b0Var, b0Var2);
            b0 b0Var3 = this.d;
            byte[] w9 = b0Var3.w(i10, b0Var3.b);
            b0 b0Var4 = this.d;
            if (((ByteBuffer) b0Var4.c).capacity() > 0) {
                int i11 = b0Var4.b;
                byte[] w10 = b0Var4.w(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(w10);
                b0Var4.c = wrap;
                wrap.position(w10.length);
                b0Var4.b = w10.length;
            }
            return w9;
        } catch (Exception e7) {
            throw new v(43, r.c.g("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
