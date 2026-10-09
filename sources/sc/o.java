package sc;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class o extends x {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public c5.b0 d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean j3;
        boolean z10;
        int i10;
        int i11;
        c5.b0 b0Var = new c5.b0(bArr.length + 1, 9);
        b0Var.n(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            j3 = b0Var.j(iArr[0]);
            int i12 = iArr[0];
            iArr[0] = i12 + 1;
            if (j3) {
                int i13 = i12 / 8;
                ((ByteBuffer) b0Var.c).put(i13, (byte) ((~(1 << (i12 % 8))) & b0Var.h(i13)));
            }
            int o9 = b0Var.o(2, iArr);
            if (o9 == 0) {
                int i14 = ((iArr[0] + 7) & (-8)) / 8;
                int h = ((255 & b0Var.h(i14 + 1)) * 256) + (b0Var.h(i14) & 255);
                iArr[0] = (i14 + 4 + h) * 8;
                if (h == 0) {
                    z10 = true;
                    i10 = b0Var.b;
                    i11 = iArr[0];
                    if (i10 <= i11 / 8) {
                        j3 = true;
                    }
                    if (j3 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (o9 == 1) {
                g gVar = g.f;
                f fVar = f.f;
                while (true) {
                    int k10 = gVar.k(b0Var, iArr);
                    if (k10 == 256) {
                        break;
                    }
                    if (k10 < 0 || k10 > 255) {
                        d.f(b0Var, iArr, k10);
                        d.d(b0Var, iArr, fVar);
                    }
                }
            } else {
                if (o9 != 2) {
                    throw new cc.k(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                e2.a0[] a0VarArr = new e2.a0[2];
                d.e(b0Var, iArr, a0VarArr);
                e2.a0 a0Var = a0VarArr[0];
                e2.a0 a0Var2 = a0VarArr[1];
                while (true) {
                    int k11 = a0Var.k(b0Var, iArr);
                    if (k11 == 256) {
                        break;
                    }
                    if (k11 < 0 || k11 > 255) {
                        d.f(b0Var, iArr, k11);
                        d.d(b0Var, iArr, a0Var2);
                    }
                }
            }
            z10 = false;
            i10 = b0Var.b;
            i11 = iArr[0];
            if (i10 <= i11 / 8) {
            }
            if (j3) {
                zArr[0] = true;
            }
        } while (!j3);
        if (zArr[0]) {
            return b0Var.r(0, hg.c.z(i11, 1, 8, -3));
        }
        int i15 = i11 % 8;
        if (i15 == 0 || i15 == 6 || i15 == 7) {
            b0Var.l(0);
        }
        int i16 = iArr[0];
        iArr[0] = i16 + 3;
        return b0Var.r(0, ((i16 + 2) / 8) + 1);
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
            throw new w(42, v.i("Failed to compress the message: ", e7.getMessage()), e7);
        }
    }

    public final byte[] c(byte[] bArr) {
        c5.b0 b0Var = new c5.b0(bArr.length + 4, 9);
        b0Var.n(bArr);
        b0Var.n(e);
        if (this.d == null) {
            this.d = new c5.b0(0, 9);
        }
        c5.b0 b0Var2 = this.d;
        int i10 = b0Var2.b;
        try {
            c.a(b0Var, b0Var2);
            c5.b0 b0Var3 = this.d;
            byte[] r10 = b0Var3.r(i10, b0Var3.b);
            c5.b0 b0Var4 = this.d;
            if (((ByteBuffer) b0Var4.c).capacity() > 0) {
                int i11 = b0Var4.b;
                byte[] r11 = b0Var4.r(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(r11);
                b0Var4.c = wrap;
                wrap.position(r11.length);
                b0Var4.b = r11.length;
            }
            return r10;
        } catch (Exception e7) {
            throw new w(43, v.i("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
