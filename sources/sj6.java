// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sj6 implements jd7 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public sj6(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                gre.f(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                gre.f(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                gre.f(z);
                break;
            case "auxiliary.tracks.map":
                gre.f(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        gre.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = tb4.g(bArr[i + 2] & 255, i, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sj6.class != obj.getClass()) {
            return false;
        }
        sj6 sj6Var = (sj6) obj;
        return this.a.equals(sj6Var.a) && Arrays.equals(this.b, sj6Var.b) && this.c == sj6Var.c && this.d == sj6Var.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ir2.j(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder r = tb4.r("track types = ");
                new zb3(String.valueOf(',')).a(r, d.iterator());
                sb = r.toString();
            }
            sb = g8c.g0(bArr);
        } else if (i == 1) {
            sb = g8c.r(bArr);
        } else if (i == 23) {
            gre.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(gle.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            gre.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(gle.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new xu7(bArr).G());
            }
            sb = g8c.g0(bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return tb4.q("mdta: key=", str, ", value=", sb);
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
