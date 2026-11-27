// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xl6 implements tf7 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public xl6(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                yve.f(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                yve.f(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                yve.f(z);
                break;
            case "auxiliary.tracks.map":
                yve.f(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // tf7
    public final ko4 a() {
        return null;
    }

    @Override // tf7
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        yve.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = qd4.g(bArr[i + 2] & 255, i, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xl6.class != obj.getClass()) {
            return false;
        }
        xl6 xl6Var = (xl6) obj;
        return this.a.equals(xl6Var.a) && Arrays.equals(this.b, xl6Var.b) && this.c == xl6Var.c && this.d == xl6Var.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + bs2.j(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder r = qd4.r("track types = ");
                new ow5(String.valueOf(','), (byte) 0).a(r, d.iterator());
                sb = r.toString();
            }
            sb = gcc.g0(bArr);
        } else if (i == 1) {
            sb = gcc.r(bArr);
        } else if (i == 23) {
            yve.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(ype.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            yve.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(ype.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new ey7(bArr).G());
            }
            sb = gcc.g0(bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return qd4.q("mdta: key=", str, ", value=", sb);
    }

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
