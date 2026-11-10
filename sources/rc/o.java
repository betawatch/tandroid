package rc;

import h2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        boolean n10;
        boolean z9;
        int i7;
        int i10;
        f5.u uVar = new f5.u(bArr.length + 1, 14);
        uVar.r(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            n10 = uVar.n(iArr[0]);
            int i11 = iArr[0];
            iArr[0] = i11 + 1;
            if (n10) {
                int i12 = i11 / 8;
                ((ByteBuffer) uVar.c).put(i12, (byte) ((~(1 << (i11 % 8))) & uVar.l(i12)));
            }
            int s5 = uVar.s(iArr, 2);
            if (s5 == 0) {
                int i13 = ((iArr[0] + 7) & (-8)) / 8;
                int l10 = ((255 & uVar.l(i13 + 1)) * 256) + (uVar.l(i13) & 255);
                iArr[0] = (i13 + 4 + l10) * 8;
                if (l10 == 0) {
                    z9 = true;
                    i7 = uVar.b;
                    i10 = iArr[0];
                    if (i7 <= i10 / 8) {
                        n10 = true;
                    }
                    if (n10 && z9) {
                        zArr[0] = true;
                    }
                }
            } else if (s5 == 1) {
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
                if (s5 != 2) {
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
            if (n10) {
                zArr[0] = true;
            }
        } while (!n10);
        if (zArr[0]) {
            return uVar.w(0, jg.g.D(i10, 1, 8, -3));
        }
        int i14 = i10 % 8;
        if (i14 == 0 || i14 == 6 || i14 == 7) {
            uVar.q(0);
        }
        int i15 = iArr[0];
        iArr[0] = i15 + 3;
        return uVar.w(0, ((i15 + 2) / 8) + 1);
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
        f5.u uVar = new f5.u(bArr.length + 4, 14);
        uVar.r(bArr);
        uVar.r(e);
        if (this.d == null) {
            this.d = new f5.u(0, 14);
        }
        f5.u uVar2 = this.d;
        int i7 = uVar2.b;
        try {
            c.a(uVar, uVar2);
            f5.u uVar3 = this.d;
            byte[] w10 = uVar3.w(i7, uVar3.b);
            f5.u uVar4 = this.d;
            if (((ByteBuffer) uVar4.c).capacity() > 0) {
                int i10 = uVar4.b;
                byte[] w11 = uVar4.w(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(w11);
                uVar4.c = wrap;
                wrap.position(w11.length);
                uVar4.b = w11.length;
            }
            return w10;
        } catch (Exception e10) {
            throw new v(43, rf.b.i("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
