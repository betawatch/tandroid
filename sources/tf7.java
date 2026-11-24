// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tf7 {
    public int a;
    public String b;
    public int c;
    public int d;
    public byte e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = uad.a[3 - i3];
        int i6 = uad.b[i5];
        this.d = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.d = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.d = i6;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    sc8.e();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.g = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? uad.c[i4 - 1] : uad.d[i4 - 1];
            this.f = i9;
            this.c = ls6.y(i9, 12, i6, i7) << 2;
        } else {
            int i10 = kk7.Z1;
            if (i2 == 3) {
                int i11 = i3 == 2 ? uad.e[i4 - 1] : uad.f[i4 - 1];
                this.f = i11;
                this.c = ls6.y(i11, kk7.Z1, i6, i7);
            } else {
                int i12 = uad.g[i4 - 1];
                this.f = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.c = ls6.y(i10, i12, i6, i7);
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? (byte) 1 : (byte) 2;
        return true;
    }
}
