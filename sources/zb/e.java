package zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class e {
    public static final byte[] d = new byte[0];
    public final yb.d a;
    public byte[] b = d;
    public final int[] c = new int[32];

    public e(yb.d dVar) {
        this.a = dVar;
    }

    public b a() {
        int[] iArr;
        yb.d dVar = this.a;
        int i3 = dVar.a;
        int i10 = dVar.b;
        b bVar = new b(i3, i10);
        if (this.b.length < i3) {
            this.b = new byte[i3];
        }
        int i11 = 0;
        while (true) {
            iArr = this.c;
            if (i11 >= 32) {
                break;
            }
            iArr[i11] = 0;
            i11++;
        }
        for (int i12 = 1; i12 < 5; i12++) {
            byte[] b10 = dVar.b((i10 * i12) / 5, this.b);
            int i13 = (i3 * 4) / 5;
            for (int i14 = i3 / 5; i14 < i13; i14++) {
                int i15 = (b10[i14] & 255) >> 3;
                iArr[i15] = iArr[i15] + 1;
            }
        }
        int length = iArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            int i20 = iArr[i19];
            if (i20 > i16) {
                i18 = i19;
                i16 = i20;
            }
            if (i20 > i17) {
                i17 = i20;
            }
        }
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < length; i23++) {
            int i24 = i23 - i18;
            int i25 = iArr[i23] * i24 * i24;
            if (i25 > i22) {
                i21 = i23;
                i22 = i25;
            }
        }
        if (i18 <= i21) {
            int i26 = i18;
            i18 = i21;
            i21 = i26;
        }
        if (i18 - i21 <= length / 16) {
            throw yb.e.a();
        }
        int i27 = i18 - 1;
        int i28 = -1;
        int i29 = i27;
        while (i27 > i21) {
            int i30 = i27 - i21;
            int i31 = (i17 - iArr[i27]) * (i18 - i27) * i30 * i30;
            if (i31 > i28) {
                i29 = i27;
                i28 = i31;
            }
            i27--;
        }
        int i32 = i29 << 3;
        byte[] a10 = dVar.a();
        for (int i33 = 0; i33 < i10; i33++) {
            int i34 = i33 * i3;
            for (int i35 = 0; i35 < i3; i35++) {
                if ((a10[i34 + i35] & 255) < i32) {
                    bVar.c(i35, i33);
                }
            }
        }
        return bVar;
    }
}
