// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wf0 extends xf0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wf0(String str, String str2) {
        super(new uf0(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        yve.f(charArray.length == 64);
    }

    @Override // xf0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        yve.n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            uf0 uf0Var = this.a;
            char[] cArr = uf0Var.b;
            char[] cArr2 = uf0Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            a(i2, i - i2, sb, bArr);
        }
    }
}
