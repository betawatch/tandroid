package w7;

import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static DispatchQueue a;

    public static void a(int i10, int i11, int[] iArr, int[] iArr2) {
        int i12;
        for (int i13 = 0; i13 < 315; i13++) {
            int i14 = i13 - 7;
            iArr2[i13] = (i14 < 0 || i14 >= 288) ? 0 : iArr[(i14 * i11) + i10];
        }
        int i15 = 0;
        while (i15 < 315) {
            iArr2[i15 + 315] = iArr2[i15];
            int i16 = i15 + 1;
            while (true) {
                i12 = i15 + 15;
                if (i16 >= i12) {
                    break;
                }
                iArr2[i16 + 315] = Math.max(iArr2[i16 + 314], iArr2[i16]);
                i16++;
            }
            iArr2[i15 + 644] = iArr2[i15 + 14];
            for (int i17 = i15 + 13; i17 >= i15; i17--) {
                iArr2[i17 + 630] = Math.max(iArr2[i17 + 631], iArr2[i17]);
            }
            i15 = i12;
        }
        for (int i18 = 0; i18 < 288; i18++) {
            iArr[(i18 * i11) + i10] = Math.max(iArr2[i18 + 630], iArr2[i18 + 329]);
        }
    }
}
