package rc;

import h2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public f5.u d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean k10;
        boolean z9;
        int i7;
        int i10;
        f5.u uVar = new f5.u(bArr.length + 1, 13);
        uVar.n(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            k10 = uVar.k(iArr[0]);
            int i11 = iArr[0];
            iArr[0] = i11 + 1;
            if (k10) {
                int i12 = i11 / 8;
                ((ByteBuffer) uVar.c).put(i12, (byte) ((~(1 << (i11 % 8))) & uVar.i(i12)));
            }
            int o4 = uVar.o(iArr, 2);
            if (o4 == 0) {
                int i13 = ((iArr[0] + 7) & (-8)) / 8;
                int i14 = ((255 & uVar.i(i13 + 1)) * 256) + (uVar.i(i13) & 255);
                iArr[0] = (i13 + 4 + i14) * 8;
                if (i14 == 0) {
                    z9 = true;
                    i7 = uVar.b;
                    i10 = iArr[0];
                    if (i7 <= i10 / 8) {
                        k10 = true;
                    }
                    if (k10 && z9) {
                        zArr[0] = true;
                    }
                }
            } else if (o4 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int m10 = gVar.m(uVar, iArr);
                    if (m10 == 256) {
                        break;
                    }
                    if (m10 < 0 || m10 > 255) {
                        d.f(uVar, iArr, m10);
                        d.d(uVar, iArr, fVar);
                    }
                }
            } else {
                if (o4 != 2) {
                    throw new ab.a0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(uVar, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int m11 = j0Var.m(uVar, iArr);
                    if (m11 == 256) {
                        break;
                    }
                    if (m11 < 0 || m11 > 255) {
                        d.f(uVar, iArr, m11);
                        d.d(uVar, iArr, j0Var2);
                    }
                }
            }
            z9 = false;
            i7 = uVar.b;
            i10 = iArr[0];
            if (i7 <= i10 / 8) {
            }
            if (k10) {
                zArr[0] = true;
            }
        } while (!k10);
        if (zArr[0]) {
            return uVar.r(0, jg.g.D(i10, 1, 8, -3));
        }
        int i15 = i10 % 8;
        if (i15 == 0 || i15 == 6 || i15 == 7) {
            uVar.m(0);
        }
        int i16 = iArr[0];
        iArr[0] = i16 + 3;
        return uVar.r(0, ((i16 + 2) / 8) + 1);
    }

    public final byte[] b(byte[] bArr) {
        int i7 = this.c;
        if (i7 != 32768 && bArr.length >= i7) {
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
        } catch (Exception e10) {
            throw new v(42, rf.b.i("Failed to compress the message: ", e10.getMessage()), e10);
        }
    }

    public final byte[] c(byte[] bArr) {
        f5.u uVar = new f5.u(bArr.length + 4, 13);
        uVar.n(bArr);
        uVar.n(e);
        if (this.d == null) {
            this.d = new f5.u(0, 13);
        }
        f5.u uVar2 = this.d;
        int i7 = uVar2.b;
        try {
            c.a(uVar, uVar2);
            f5.u uVar3 = this.d;
            byte[] r10 = uVar3.r(i7, uVar3.b);
            f5.u uVar4 = this.d;
            if (((ByteBuffer) uVar4.c).capacity() > 0) {
                int i10 = uVar4.b;
                byte[] r11 = uVar4.r(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(r11);
                uVar4.c = wrap;
                wrap.position(r11.length);
                uVar4.b = r11.length;
            }
            return r10;
        } catch (Exception e10) {
            throw new v(43, rf.b.i("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
