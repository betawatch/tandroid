package rc;

import ab.b0;
import h2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public b3.j d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean n10;
        boolean z10;
        int i7;
        int i10;
        b3.j jVar = new b3.j(bArr.length + 1, 13);
        jVar.q(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            n10 = jVar.n(iArr[0]);
            int i11 = iArr[0];
            iArr[0] = i11 + 1;
            if (n10) {
                int i12 = i11 / 8;
                ((ByteBuffer) jVar.c).put(i12, (byte) ((~(1 << (i11 % 8))) & jVar.l(i12)));
            }
            int r10 = jVar.r(iArr, 2);
            if (r10 == 0) {
                int i13 = ((iArr[0] + 7) & (-8)) / 8;
                int l10 = ((255 & jVar.l(i13 + 1)) * 256) + (jVar.l(i13) & 255);
                iArr[0] = (i13 + 4 + l10) * 8;
                if (l10 == 0) {
                    z10 = true;
                    i7 = jVar.b;
                    i10 = iArr[0];
                    if (i7 <= i10 / 8) {
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
                    int m10 = gVar.m(jVar, iArr);
                    if (m10 == 256) {
                        break;
                    }
                    if (m10 < 0 || m10 > 255) {
                        d.f(jVar, iArr, m10);
                        d.d(jVar, iArr, fVar);
                    }
                }
            } else {
                if (r10 != 2) {
                    throw new b0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(jVar, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int m11 = j0Var.m(jVar, iArr);
                    if (m11 == 256) {
                        break;
                    }
                    if (m11 < 0 || m11 > 255) {
                        d.f(jVar, iArr, m11);
                        d.d(jVar, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i7 = jVar.b;
            i10 = iArr[0];
            if (i7 <= i10 / 8) {
            }
            if (n10) {
                zArr[0] = true;
            }
        } while (!n10);
        if (zArr[0]) {
            return jVar.u(0, i5.c.e(i10, 1, 8, -3));
        }
        int i14 = i10 % 8;
        if (i14 == 0 || i14 == 6 || i14 == 7) {
            jVar.p(0);
        }
        int i15 = iArr[0];
        iArr[0] = i15 + 3;
        return jVar.u(0, ((i15 + 2) / 8) + 1);
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
            throw new v(42, p5.c.k("Failed to compress the message: ", e10.getMessage()), e10);
        }
    }

    public final byte[] c(byte[] bArr) {
        b3.j jVar = new b3.j(bArr.length + 4, 13);
        jVar.q(bArr);
        jVar.q(e);
        if (this.d == null) {
            this.d = new b3.j(0, 13);
        }
        b3.j jVar2 = this.d;
        int i7 = jVar2.b;
        try {
            c.a(jVar, jVar2);
            b3.j jVar3 = this.d;
            byte[] u10 = jVar3.u(i7, jVar3.b);
            b3.j jVar4 = this.d;
            if (((ByteBuffer) jVar4.c).capacity() > 0) {
                int i10 = jVar4.b;
                byte[] u11 = jVar4.u(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(u11);
                jVar4.c = wrap;
                wrap.position(u11.length);
                jVar4.b = u11.length;
            }
            return u10;
        } catch (Exception e10) {
            throw new v(43, p5.c.k("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
