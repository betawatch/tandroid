// default package

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class txe {
    public static int[] a;

    public static int a(ArrayList arrayList, de deVar) {
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) deVar.c;
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            tub tubVar = (tub) obj;
            tub tubVar2 = new tub();
            tubVar2.a = tubVar.a;
            tubVar2.b = tubVar.b;
            tubVar2.c = tubVar.c;
            tubVar2.d = new int[tubVar.d.length];
            int i2 = 0;
            while (true) {
                int[] iArr = tubVar.d;
                if (i2 < iArr.length) {
                    tubVar2.d[i2] = iArr[i2] + size;
                    i2++;
                }
            }
            arrayList.add(tubVar2);
        }
        return deVar.b + size;
    }

    public static de b(byte[] bArr) {
        if (c(0, 4, bArr) != -1242653582) {
            u36.j("Unsupported BOC");
            return null;
        }
        int i = bArr[4];
        boolean z = (i & 128) != 0;
        int i2 = i & 7;
        int i3 = bArr[5] & nm7.d4;
        int c = c(6, i2, bArr);
        int i4 = 6 + i2;
        int c2 = c(i4, i2, bArr);
        int i5 = i4 + i2 + i2 + i3;
        if (c2 != 1) {
            u36.j("Expected one root cell");
            return null;
        }
        int c3 = c(i5, i2, bArr);
        int i6 = i5 + i2;
        if (z) {
            i6 += i3 * c;
        }
        de deVar = new de((byte) 19, false);
        deVar.c = new ArrayList();
        deVar.b = c3;
        for (int i7 = 0; i7 < c; i7++) {
            tub tubVar = new tub();
            int i8 = i6 + 1;
            int i9 = bArr[i6];
            tubVar.a = i9 & nm7.d4;
            int i10 = i6 + 2;
            int i11 = bArr[i8] & nm7.d4;
            tubVar.b = i11;
            if ((i9 & 16) != 0) {
                u36.j("Cells with cached hashes are not supported");
                return null;
            }
            int i12 = i9 & 7;
            int i13 = (i11 + 1) / 2;
            byte[] bArr2 = new byte[i13];
            tubVar.c = bArr2;
            System.arraycopy(bArr, i10, bArr2, 0, i13);
            i6 = i10 + i13;
            tubVar.d = new int[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                tubVar.d[i14] = c(i6, i2, bArr);
                i6 += i2;
            }
            ((ArrayList) deVar.c).add(tubVar);
        }
        return deVar;
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
            byteArrayOutputStream.write((i >>> (i3 << 3)) & nm7.d4);
        }
    }
}
