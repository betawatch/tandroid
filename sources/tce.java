// default package

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class tce extends l4e implements Cloneable {
    public boolean E;
    public long a;
    public long b;
    public int c;
    public yce[] d;
    public byte[] e;
    public byte[] f;
    public String h;
    public String n;
    public String r;
    public long s;
    public byte[] w;
    public String x;
    public int[] y;

    @Override // l4e
    public final void a(sld sldVar) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j = this.a;
        if (j != 0) {
            sldVar.h(1, 0);
            sldVar.k(j);
        }
        yce[] yceVarArr = this.d;
        if (yceVarArr != null && yceVarArr.length > 0) {
            int i = 0;
            while (true) {
                yce[] yceVarArr2 = this.d;
                if (i >= yceVarArr2.length) {
                    break;
                }
                yce yceVar = yceVarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = wed.b;
        if (!Arrays.equals(bArr, bArr2)) {
            sldVar.d(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            sldVar.d(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            sldVar.c(8, str4);
        }
        int i2 = this.c;
        if (i2 != 0) {
            sldVar.h(11, 0);
            if (i2 >= 0) {
                sldVar.f(i2);
            } else {
                sldVar.k(i2);
            }
        }
        if (str3 != null && !str3.equals("")) {
            sldVar.c(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            sldVar.c(14, str2);
        }
        long j2 = this.s;
        if (j2 != 180000) {
            sldVar.h(15, 0);
            sldVar.k((j2 << 1) ^ (j2 >> 63));
        }
        long j3 = this.b;
        if (j3 != 0) {
            sldVar.h(17, 0);
            sldVar.k(j3);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            sldVar.d(18, this.w);
        }
        int[] iArr = this.y;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.y;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i3];
                sldVar.h(20, 0);
                if (i4 >= 0) {
                    sldVar.f(i4);
                } else {
                    sldVar.k(i4);
                }
                i3++;
            }
        }
        if (str != null && !str.equals("")) {
            sldVar.c(24, str);
        }
        boolean z = this.E;
        if (z) {
            sldVar.h(25, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) sldVar.a;
            if (!byteBuffer.hasRemaining()) {
                throw new bk2(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b);
        }
    }

    public final Object clone() {
        try {
            tce tceVar = (tce) d();
            yce[] yceVarArr = this.d;
            if (yceVarArr != null && yceVarArr.length > 0) {
                tceVar.d = new yce[yceVarArr.length];
                int i = 0;
                while (true) {
                    yce[] yceVarArr2 = this.d;
                    if (i >= yceVarArr2.length) {
                        break;
                    }
                    yce yceVar = yceVarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                tceVar.y = (int[]) iArr.clone();
            }
            return tceVar;
        } catch (CloneNotSupportedException e) {
            fi7.g(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tce)) {
            return false;
        }
        tce tceVar = (tce) obj;
        if (this.a != tceVar.a || this.b != tceVar.b || this.c != tceVar.c) {
            return false;
        }
        yce[] yceVarArr = this.d;
        yce[] yceVarArr2 = tceVar.d;
        Object obj2 = j5e.a;
        int length = yceVarArr == null ? 0 : yceVarArr.length;
        int length2 = yceVarArr2 == null ? 0 : yceVarArr2.length;
        int i = 0;
        while (i < length) {
            yce yceVar = yceVarArr[i];
            i++;
        }
        int i2 = 0;
        while (i2 < length2) {
            yce yceVar2 = yceVarArr2[i2];
            i2++;
        }
        boolean z = i >= length;
        boolean z2 = i2 >= length2;
        if (!z || !z2) {
            if (z != z2) {
                return false;
            }
            yce yceVar3 = yceVarArr[i];
            yce yceVar4 = yceVarArr2[i2];
            throw null;
        }
        if (!Arrays.equals(this.e, tceVar.e) || !Arrays.equals(this.f, tceVar.f)) {
            return false;
        }
        String str = this.h;
        String str2 = tceVar.h;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.n;
        String str4 = tceVar.n;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.r;
        String str6 = tceVar.r;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        if (this.s != tceVar.s || !Arrays.equals(this.w, tceVar.w)) {
            return false;
        }
        String str7 = this.x;
        String str8 = tceVar.x;
        if (str7 == null) {
            if (str8 != null) {
                return false;
            }
        } else if (!str7.equals(str8)) {
            return false;
        }
        int[] iArr = this.y;
        int[] iArr2 = tceVar.y;
        return ((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.E == tceVar.E;
    }

    public final int hashCode() {
        int hashCode = (tce.class.getName().hashCode() + 527) * 31;
        long j = this.a;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.b;
        int i2 = ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        yce[] yceVarArr = this.d;
        Object obj = j5e.a;
        int i3 = 0;
        int length = yceVarArr == null ? 0 : yceVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            yce yceVar = yceVarArr[i4];
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (i2 * 961)) * 961)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.r;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j3 = this.s;
        int hashCode6 = (Arrays.hashCode(this.w) + ((((hashCode4 + hashCode5) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 961)) * 31;
        String str4 = this.x;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.y;
        if (iArr != null && iArr.length != 0) {
            i3 = Arrays.hashCode(iArr);
        }
        return (((hashCode7 + i3) * 29791) + (this.E ? 1231 : 1237)) * 31;
    }
}
