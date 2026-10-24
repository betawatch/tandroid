package tc;

import c5.c0;
import e2.j0;
import i2.o1;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import si.o0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        boolean o10;
        boolean z10;
        int i10;
        int i11;
        c0 c0Var = new c0(bArr.length + 1, 11);
        c0Var.r(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            o10 = c0Var.o(iArr[0]);
            int i12 = iArr[0];
            iArr[0] = i12 + 1;
            if (o10) {
                int i13 = i12 / 8;
                ((ByteBuffer) c0Var.c).put(i13, (byte) ((~(1 << (i12 % 8))) & c0Var.m(i13)));
            }
            int s10 = c0Var.s(2, iArr);
            if (s10 == 0) {
                int i14 = ((iArr[0] + 7) & (-8)) / 8;
                int m10 = ((255 & c0Var.m(i14 + 1)) * 256) + (c0Var.m(i14) & 255);
                iArr[0] = (i14 + 4 + m10) * 8;
                if (m10 == 0) {
                    z10 = true;
                    i10 = c0Var.b;
                    i11 = iArr[0];
                    if (i10 <= i11 / 8) {
                        o10 = true;
                    }
                    if (o10 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (s10 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int i15 = gVar.i(c0Var, iArr);
                    if (i15 == 256) {
                        break;
                    }
                    if (i15 < 0 || i15 > 255) {
                        d.f(c0Var, iArr, i15);
                        d.d(c0Var, iArr, fVar);
                    }
                }
            } else {
                if (s10 != 2) {
                    throw new com.google.firebase.messaging.q(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(c0Var, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int i16 = j0Var.i(c0Var, iArr);
                    if (i16 == 256) {
                        break;
                    }
                    if (i16 < 0 || i16 > 255) {
                        d.f(c0Var, iArr, i16);
                        d.d(c0Var, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i10 = c0Var.b;
            i11 = iArr[0];
            if (i10 <= i11 / 8) {
            }
            if (o10) {
                zArr[0] = true;
            }
        } while (!o10);
        if (zArr[0]) {
            return c0Var.x(0, o1.C(i11, 1, 8, -3));
        }
        int i17 = i11 % 8;
        if (i17 == 0 || i17 == 6 || i17 == 7) {
            c0Var.q(0);
        }
        int i18 = iArr[0];
        iArr[0] = i18 + 3;
        return c0Var.x(0, ((i18 + 2) / 8) + 1);
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
            throw new v(42, o0.h("Failed to compress the message: ", e7.getMessage()), e7);
        }
    }

    public final byte[] c(byte[] bArr) {
        c0 c0Var = new c0(bArr.length + 4, 11);
        c0Var.r(bArr);
        c0Var.r(e);
        if (this.d == null) {
            this.d = new c0(0, 11);
        }
        c0 c0Var2 = this.d;
        int i10 = c0Var2.b;
        try {
            c.a(c0Var, c0Var2);
            c0 c0Var3 = this.d;
            byte[] x10 = c0Var3.x(i10, c0Var3.b);
            c0 c0Var4 = this.d;
            if (((ByteBuffer) c0Var4.c).capacity() > 0) {
                int i11 = c0Var4.b;
                byte[] x11 = c0Var4.x(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(x11);
                c0Var4.c = wrap;
                wrap.position(x11.length);
                c0Var4.b = x11.length;
            }
            return x10;
        } catch (Exception e7) {
            throw new v(43, o0.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
