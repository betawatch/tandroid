// default package

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class rve {
    public static int[] a;

    public static int a(ArrayList arrayList, dd ddVar) {
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) ddVar.c;
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            ssb ssbVar = (ssb) obj;
            ssb ssbVar2 = new ssb();
            ssbVar2.a = ssbVar.a;
            ssbVar2.b = ssbVar.b;
            ssbVar2.c = ssbVar.c;
            ssbVar2.d = new int[ssbVar.d.length];
            int i2 = 0;
            while (true) {
                int[] iArr = ssbVar.d;
                if (i2 < iArr.length) {
                    ssbVar2.d[i2] = iArr[i2] + size;
                    i2++;
                }
            }
            arrayList.add(ssbVar2);
        }
        return ddVar.b + size;
    }

    public static dd b(byte[] bArr) {
        if (c(0, 4, bArr) != -1242653582) {
            w26.j("Unsupported BOC");
            return null;
        }
        int i = bArr[4];
        boolean z = (i & 128) != 0;
        int i2 = i & 7;
        int i3 = bArr[5] & kk7.d4;
        int c = c(6, i2, bArr);
        int i4 = 6 + i2;
        int c2 = c(i4, i2, bArr);
        int i5 = i4 + i2 + i2 + i3;
        if (c2 != 1) {
            w26.j("Expected one root cell");
            return null;
        }
        int c3 = c(i5, i2, bArr);
        int i6 = i5 + i2;
        if (z) {
            i6 += i3 * c;
        }
        dd ddVar = new dd((byte) 19, false);
        ddVar.c = new ArrayList();
        ddVar.b = c3;
        for (int i7 = 0; i7 < c; i7++) {
            ssb ssbVar = new ssb();
            int i8 = i6 + 1;
            int i9 = bArr[i6];
            ssbVar.a = i9 & kk7.d4;
            int i10 = i6 + 2;
            int i11 = bArr[i8] & kk7.d4;
            ssbVar.b = i11;
            if ((i9 & 16) != 0) {
                w26.j("Cells with cached hashes are not supported");
                return null;
            }
            int i12 = i9 & 7;
            int i13 = (i11 + 1) / 2;
            byte[] bArr2 = new byte[i13];
            ssbVar.c = bArr2;
            System.arraycopy(bArr, i10, bArr2, 0, i13);
            i6 = i10 + i13;
            ssbVar.d = new int[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                ssbVar.d[i14] = c(i6, i2, bArr);
                i6 += i2;
            }
            ((ArrayList) ddVar.c).add(ssbVar);
        }
        return ddVar;
    }

    public static int c(int i, int i2, byte[] bArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | (bArr[i + i4] & 255);
        }
        return i3;
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            byteArrayOutputStream.write((i >>> (i3 << 3)) & kk7.d4);
        }
    }
}
