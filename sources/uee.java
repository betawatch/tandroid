// default package

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class uee extends o6e implements Cloneable {
    public boolean E;
    public long a;
    public long b;
    public int c;
    public zee[] d;
    public byte[] e;
    public byte[] f;
    public String h;
    public String n;
    public String r;
    public long s;
    public byte[] w;
    public String x;
    public int[] y;

    @Override // o6e
    public final void a(und undVar) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j = this.a;
        if (j != 0) {
            undVar.h(1, 0);
            undVar.j(j);
        }
        zee[] zeeVarArr = this.d;
        if (zeeVarArr != null && zeeVarArr.length > 0) {
            int i = 0;
            while (true) {
                zee[] zeeVarArr2 = this.d;
                if (i >= zeeVarArr2.length) {
                    break;
                }
                zee zeeVar = zeeVarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = xgd.b;
        if (!Arrays.equals(bArr, bArr2)) {
            undVar.c(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            undVar.c(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            undVar.b(8, str4);
        }
        int i2 = this.c;
        if (i2 != 0) {
            undVar.h(11, 0);
            if (i2 >= 0) {
                undVar.f(i2);
            } else {
                undVar.j(i2);
            }
        }
        if (str3 != null && !str3.equals("")) {
            undVar.b(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            undVar.b(14, str2);
        }
        long j2 = this.s;
        if (j2 != 180000) {
            undVar.h(15, 0);
            undVar.j((j2 << 1) ^ (j2 >> 63));
        }
        long j3 = this.b;
        if (j3 != 0) {
            undVar.h(17, 0);
            undVar.j(j3);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            undVar.c(18, this.w);
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
                undVar.h(20, 0);
                if (i4 >= 0) {
                    undVar.f(i4);
                } else {
                    undVar.j(i4);
                }
                i3++;
            }
        }
        if (str != null && !str.equals("")) {
            undVar.b(24, str);
        }
        boolean z = this.E;
        if (z) {
            undVar.h(25, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) undVar.a;
            if (!byteBuffer.hasRemaining()) {
                throw new ol2(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b);
        }
    }

    public final Object clone() {
        try {
            uee ueeVar = (uee) d();
            zee[] zeeVarArr = this.d;
            if (zeeVarArr != null && zeeVarArr.length > 0) {
                ueeVar.d = new zee[zeeVarArr.length];
                int i = 0;
                while (true) {
                    zee[] zeeVarArr2 = this.d;
                    if (i >= zeeVarArr2.length) {
                        break;
                    }
                    zee zeeVar = zeeVarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                ueeVar.y = (int[]) iArr.clone();
            }
            return ueeVar;
        } catch (CloneNotSupportedException e) {
            bh7.j(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uee)) {
            return false;
        }
        uee ueeVar = (uee) obj;
        if (this.a != ueeVar.a || this.b != ueeVar.b || this.c != ueeVar.c) {
            return false;
        }
        zee[] zeeVarArr = this.d;
        zee[] zeeVarArr2 = ueeVar.d;
        Object obj2 = m7e.a;
        int length = zeeVarArr == null ? 0 : zeeVarArr.length;
        int length2 = zeeVarArr2 == null ? 0 : zeeVarArr2.length;
        int i = 0;
        while (i < length) {
            zee zeeVar = zeeVarArr[i];
            i++;
        }
        int i2 = 0;
        while (i2 < length2) {
            zee zeeVar2 = zeeVarArr2[i2];
            i2++;
        }
        boolean z = i >= length;
        boolean z2 = i2 >= length2;
        if (!z || !z2) {
            if (z != z2) {
                return false;
            }
            zee zeeVar3 = zeeVarArr[i];
            zee zeeVar4 = zeeVarArr2[i2];
            throw null;
        }
        if (!Arrays.equals(this.e, ueeVar.e) || !Arrays.equals(this.f, ueeVar.f)) {
            return false;
        }
        String str = this.h;
        String str2 = ueeVar.h;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.n;
        String str4 = ueeVar.n;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.r;
        String str6 = ueeVar.r;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        if (this.s != ueeVar.s || !Arrays.equals(this.w, ueeVar.w)) {
            return false;
        }
        String str7 = this.x;
        String str8 = ueeVar.x;
        if (str7 == null) {
            if (str8 != null) {
                return false;
            }
        } else if (!str7.equals(str8)) {
            return false;
        }
        int[] iArr = this.y;
        int[] iArr2 = ueeVar.y;
        return ((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.E == ueeVar.E;
    }

    public final int hashCode() {
        int hashCode = (uee.class.getName().hashCode() + 527) * 31;
        long j = this.a;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.b;
        int i2 = ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        zee[] zeeVarArr = this.d;
        Object obj = m7e.a;
        int i3 = 0;
        int length = zeeVarArr == null ? 0 : zeeVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            zee zeeVar = zeeVarArr[i4];
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
