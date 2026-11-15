package rc;

import ab.b0;
import h2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public f5.v d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean n10;
        boolean z10;
        int i7;
        int i10;
        f5.v vVar = new f5.v(bArr.length + 1, 14);
        vVar.r(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            n10 = vVar.n(iArr[0]);
            int i11 = iArr[0];
            iArr[0] = i11 + 1;
            if (n10) {
                int i12 = i11 / 8;
                ((ByteBuffer) vVar.c).put(i12, (byte) ((~(1 << (i11 % 8))) & vVar.l(i12)));
            }
            int s5 = vVar.s(iArr, 2);
            if (s5 == 0) {
                int i13 = ((iArr[0] + 7) & (-8)) / 8;
                int l10 = ((255 & vVar.l(i13 + 1)) * 256) + (vVar.l(i13) & 255);
                iArr[0] = (i13 + 4 + l10) * 8;
                if (l10 == 0) {
                    z10 = true;
                    i7 = vVar.b;
                    i10 = iArr[0];
                    if (i7 <= i10 / 8) {
                        n10 = true;
                    }
                    if (n10 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (s5 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int m10 = gVar.m(vVar, iArr);
                    if (m10 == 256) {
                        break;
                    }
                    if (m10 < 0 || m10 > 255) {
                        d.f(vVar, iArr, m10);
                        d.d(vVar, iArr, fVar);
                    }
                }
            } else {
                if (s5 != 2) {
                    throw new b0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(vVar, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int m11 = j0Var.m(vVar, iArr);
                    if (m11 == 256) {
                        break;
                    }
                    if (m11 < 0 || m11 > 255) {
                        d.f(vVar, iArr, m11);
                        d.d(vVar, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i7 = vVar.b;
            i10 = iArr[0];
            if (i7 <= i10 / 8) {
            }
            if (n10) {
                zArr[0] = true;
            }
        } while (!n10);
        if (zArr[0]) {
            return vVar.v(0, i5.c.e(i10, 1, 8, -3));
        }
        int i14 = i10 % 8;
        if (i14 == 0 || i14 == 6 || i14 == 7) {
            vVar.q(0);
        }
        int i15 = iArr[0];
        iArr[0] = i15 + 3;
        return vVar.v(0, ((i15 + 2) / 8) + 1);
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
            throw new v(42, r.b.k("Failed to compress the message: ", e10.getMessage()), e10);
        }
    }

    public final byte[] c(byte[] bArr) {
        f5.v vVar = new f5.v(bArr.length + 4, 14);
        vVar.r(bArr);
        vVar.r(e);
        if (this.d == null) {
            this.d = new f5.v(0, 14);
        }
        f5.v vVar2 = this.d;
        int i7 = vVar2.b;
        try {
            c.a(vVar, vVar2);
            f5.v vVar3 = this.d;
            byte[] v = vVar3.v(i7, vVar3.b);
            f5.v vVar4 = this.d;
            if (((ByteBuffer) vVar4.c).capacity() > 0) {
                int i10 = vVar4.b;
                byte[] v10 = vVar4.v(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(v10);
                vVar4.c = wrap;
                wrap.position(v10.length);
                vVar4.b = v10.length;
            }
            return v;
        } catch (Exception e10) {
            throw new v(43, r.b.k("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
