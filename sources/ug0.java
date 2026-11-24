// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ug0 extends vg0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ug0(String str, String str2) {
        super(new sg0(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        jte.f(charArray.length == 64);
    }

    @Override // vg0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        jte.n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            sg0 sg0Var = this.a;
            char[] cArr = sg0Var.b;
            char[] cArr2 = sg0Var.b;
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
