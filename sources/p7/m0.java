package p7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 extends n0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m0(String str, String str2) {
        super(new k0(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // p7.n0
    public final void a(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        a.m(0, i3, bArr.length);
        for (int i11 = i3; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            k0 k0Var = this.a;
            char[] cArr = k0Var.b;
            char[] cArr2 = k0Var.b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr2[(i12 >>> 12) & 63]);
            sb2.append(cArr2[(i12 >>> 6) & 63]);
            sb2.append(cArr2[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i3) {
            b(sb2, bArr, i10, i3 - i10);
        }
    }
}
