package sb;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final nb.b a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final ArrayList b = new ArrayList(5);
    public final int[] h = new int[3];

    public b(nb.b bVar, int i10, int i11, int i12, int i13, float f9) {
        this.a = bVar;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = f9;
    }

    public final boolean a(int[] iArr) {
        float f9 = this.g;
        float f10 = f9 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f9 - iArr[i10]) >= f10) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i10, int i11, int[] iArr) {
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = i13 + i14 + iArr[2];
        float f9 = (i11 - r5) - (i14 / 2.0f);
        int i16 = (int) f9;
        int i17 = i14 * 2;
        nb.b bVar = this.a;
        int i18 = bVar.b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i19 = i10;
        while (i19 >= 0 && bVar.b(i16, i19)) {
            int i20 = iArr2[1];
            if (i20 > i17) {
                break;
            }
            iArr2[1] = i20 + 1;
            i19--;
        }
        float f10 = Float.NaN;
        if (i19 >= 0 && iArr2[1] <= i17) {
            while (i19 >= 0 && !bVar.b(i16, i19)) {
                int i21 = iArr2[0];
                if (i21 > i17) {
                    break;
                }
                iArr2[0] = i21 + 1;
                i19--;
            }
            if (iArr2[0] <= i17) {
                int i22 = i10 + 1;
                while (i22 < i18 && bVar.b(i16, i22)) {
                    int i23 = iArr2[1];
                    if (i23 > i17) {
                        break;
                    }
                    iArr2[1] = i23 + 1;
                    i22++;
                }
                if (i22 != i18 && iArr2[1] <= i17) {
                    while (i22 < i18 && !bVar.b(i16, i22)) {
                        int i24 = iArr2[2];
                        if (i24 > i17) {
                            break;
                        }
                        iArr2[2] = i24 + 1;
                        i22++;
                    }
                    int i25 = iArr2[2];
                    if (i25 <= i17 && Math.abs(((iArr2[0] + iArr2[1]) + i25) - i15) * 5 < i15 * 2 && a(iArr2)) {
                        f10 = (i22 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f10)) {
            return null;
        }
        float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            a aVar = (a) obj;
            float f12 = aVar.c;
            float f13 = aVar.a;
            float f14 = aVar.b;
            if (Math.abs(f10 - f14) <= f11 && Math.abs(f9 - f13) <= f11) {
                float abs = Math.abs(f11 - f12);
                if (abs <= 1.0f || abs <= f12) {
                    return new a((f13 + f9) / 2.0f, (f14 + f10) / 2.0f, (aVar.c + f11) / 2.0f);
                }
            }
        }
        arrayList.add(new a(f9, f10, f11));
        return null;
    }
}
