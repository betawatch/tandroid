// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vl6 implements lf7 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public vl6(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                jte.f(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                jte.f(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                jte.f(z);
                break;
            case "auxiliary.tracks.map":
                jte.f(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final ArrayList d() {
        jte.o("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = td4.g(bArr[i + 2] & 255, i, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vl6.class != obj.getClass()) {
            return false;
        }
        vl6 vl6Var = (vl6) obj;
        return this.a.equals(vl6Var.a) && Arrays.equals(this.b, vl6Var.b) && this.c == vl6Var.c && this.d == vl6Var.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ts2.j(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d = d();
                StringBuilder s = td4.s("track types = ");
                new jw5(String.valueOf(','), (byte) 0).a(s, d.iterator());
                sb = s.toString();
            }
            sb = hac.g0(bArr);
        } else if (i == 1) {
            sb = hac.r(bArr);
        } else if (i == 23) {
            jte.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(ine.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            jte.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            sb = String.valueOf(ine.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new yw7(bArr).G());
            }
            sb = hac.g0(bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return td4.r("mdta: key=", str, ", value=", sb);
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
