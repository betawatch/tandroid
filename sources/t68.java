// default package

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t68 extends tyc {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public ed d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean i0;
        boolean z;
        int i;
        int i2;
        ed edVar = new ed(bArr.length + 1, (byte) 3);
        edVar.n0(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            i0 = edVar.i0(iArr[0]);
            int i3 = iArr[0];
            iArr[0] = i3 + 1;
            if (i0) {
                int i4 = i3 / 8;
                ((ByteBuffer) edVar.c).put(i4, (byte) (edVar.g0(i4) & (~(1 << (i3 % 8)))));
            }
            int o0 = edVar.o0(iArr, 2);
            if (o0 == 0) {
                int i5 = ((iArr[0] + 7) & (-8)) / 8;
                int g0 = (edVar.g0(i5) & 255) + ((edVar.g0(i5 + 1) & 255) << 8);
                iArr[0] = ((i5 + 4) + g0) << 3;
                if (g0 == 0) {
                    z = true;
                    i = edVar.b;
                    i2 = iArr[0];
                    if (i <= i2 / 8) {
                        i0 = true;
                    }
                    if (i0 && z) {
                        zArr[0] = true;
                    }
                }
            } else if (o0 == 1) {
                bk4 bk4Var = bk4.e;
                wj4 wj4Var = wj4.e;
                while (true) {
                    int m = bk4Var.m(edVar, iArr);
                    if (m == 256) {
                        break;
                    }
                    if (m < 0 || m > 255) {
                        ud3.e(edVar, iArr, m);
                        ud3.c(edVar, iArr, wj4Var);
                    }
                }
            } else {
                if (o0 != 2) {
                    throw new w30(String.format("[%s] Bad compression type '11' at the bit index '%d'.", t68.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                jq[] jqVarArr = new jq[2];
                ud3.d(edVar, iArr, jqVarArr);
                jq jqVar = jqVarArr[0];
                jq jqVar2 = jqVarArr[1];
                while (true) {
                    int m2 = jqVar.m(edVar, iArr);
                    if (m2 == 256) {
                        break;
                    }
                    if (m2 < 0 || m2 > 255) {
                        ud3.e(edVar, iArr, m2);
                        ud3.c(edVar, iArr, jqVar2);
                    }
                }
            }
            z = false;
            i = edVar.b;
            i2 = iArr[0];
            if (i <= i2 / 8) {
            }
            if (i0) {
                zArr[0] = true;
            }
        } while (!i0);
        if (zArr[0]) {
            return edVar.t0(0, ik8.g(i2, 1, 8, -3));
        }
        int i6 = i2 % 8;
        if (i6 == 0 || i6 == 6 || i6 == 7) {
            edVar.m0(0);
        }
        int i7 = iArr[0];
        iArr[0] = i7 + 3;
        return edVar.t0(0, ((i7 + 2) / 8) + 1);
    }

    public final byte[] b(byte[] bArr) {
        int i = this.c;
        if (i != 32768 && bArr.length >= i) {
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
        } catch (Exception e2) {
            throw new syc(42, c00.i("Failed to compress the message: ", e2.getMessage()), e2);
        }
    }

    public final byte[] c(byte[] bArr) {
        ed edVar = new ed(bArr.length + 4, (byte) 3);
        edVar.n0(bArr);
        edVar.n0(e);
        ed edVar2 = this.d;
        if (edVar2 == null) {
            edVar2 = new ed(0, (byte) 3);
            this.d = edVar2;
        }
        int i = edVar2.b;
        try {
            td3.a(edVar, edVar2);
            ed edVar3 = this.d;
            byte[] t0 = edVar3.t0(i, edVar3.b);
            ed edVar4 = this.d;
            if (((ByteBuffer) edVar4.c).capacity() > 0) {
                int i2 = edVar4.b;
                byte[] t02 = edVar4.t0(i2, i2);
                ByteBuffer wrap = ByteBuffer.wrap(t02);
                edVar4.c = wrap;
                wrap.position(t02.length);
                edVar4.b = t02.length;
            }
            return t0;
        } catch (Exception e2) {
            throw new syc(43, c00.i("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}
