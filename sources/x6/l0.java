package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 extends m0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(String str, String str2) {
        super(new j0(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // x6.m0
    public final void a(StringBuilder sb2, byte[] bArr, int i9) {
        int i10 = 0;
        a.m(0, i9, bArr.length);
        for (int i11 = i9; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            j0 j0Var = this.a;
            char[] cArr = j0Var.b;
            char[] cArr2 = j0Var.b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr2[(i12 >>> 12) & 63]);
            sb2.append(cArr2[(i12 >>> 6) & 63]);
            sb2.append(cArr2[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i9) {
            b(sb2, bArr, i10, i9 - i10);
        }
    }
}
