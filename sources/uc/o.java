package uc;

import e2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public d5.z d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean k10;
        boolean z10;
        int i10;
        int i11;
        d5.z zVar = new d5.z(bArr.length + 1, 12);
        zVar.n(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            k10 = zVar.k(iArr[0]);
            int i12 = iArr[0];
            iArr[0] = i12 + 1;
            if (k10) {
                int i13 = i12 / 8;
                ((ByteBuffer) zVar.c).put(i13, (byte) ((~(1 << (i12 % 8))) & zVar.i(i13)));
            }
            int p10 = zVar.p(2, iArr);
            if (p10 == 0) {
                int i14 = ((iArr[0] + 7) & (-8)) / 8;
                int i15 = ((255 & zVar.i(i14 + 1)) * 256) + (zVar.i(i14) & 255);
                iArr[0] = (i14 + 4 + i15) * 8;
                if (i15 == 0) {
                    z10 = true;
                    i10 = zVar.b;
                    i11 = iArr[0];
                    if (i10 <= i11 / 8) {
                        k10 = true;
                    }
                    if (k10 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (p10 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int i16 = gVar.i(zVar, iArr);
                    if (i16 == 256) {
                        break;
                    }
                    if (i16 < 0 || i16 > 255) {
                        d.f(zVar, iArr, i16);
                        d.d(zVar, iArr, fVar);
                    }
                }
            } else {
                if (p10 != 2) {
                    throw new com.google.firebase.messaging.p(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(zVar, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int i17 = j0Var.i(zVar, iArr);
                    if (i17 == 256) {
                        break;
                    }
                    if (i17 < 0 || i17 > 255) {
                        d.f(zVar, iArr, i17);
                        d.d(zVar, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i10 = zVar.b;
            i11 = iArr[0];
            if (i10 <= i11 / 8) {
            }
            if (k10) {
                zArr[0] = true;
            }
        } while (!k10);
        if (zArr[0]) {
            return zVar.s(0, ic.a.A(i11, 1, 8, -3));
        }
        int i18 = i11 % 8;
        if (i18 == 0 || i18 == 6 || i18 == 7) {
            zVar.m(0);
        }
        int i19 = iArr[0];
        iArr[0] = i19 + 3;
        return zVar.s(0, ((i19 + 2) / 8) + 1);
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
        } catch (Exception e10) {
            throw new v(42, b10.j("Failed to compress the message: ", e10.getMessage()), e10);
        }
    }

    public final byte[] c(byte[] bArr) {
        d5.z zVar = new d5.z(bArr.length + 4, 12);
        zVar.n(bArr);
        zVar.n(e);
        if (this.d == null) {
            this.d = new d5.z(0, 12);
        }
        d5.z zVar2 = this.d;
        int i10 = zVar2.b;
        try {
            c.a(zVar, zVar2);
            d5.z zVar3 = this.d;
            byte[] s10 = zVar3.s(i10, zVar3.b);
            d5.z zVar4 = this.d;
            if (((ByteBuffer) zVar4.c).capacity() > 0) {
                int i11 = zVar4.b;
                byte[] s11 = zVar4.s(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(s11);
                zVar4.c = wrap;
                wrap.position(s11.length);
                zVar4.b = s11.length;
            }
            return s10;
        } catch (Exception e10) {
            throw new v(43, b10.j("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
