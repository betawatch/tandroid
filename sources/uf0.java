// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uf0 extends vf0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uf0(String str, String str2) {
        super(new sf0(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        gre.f(charArray.length == 64);
    }

    @Override // vf0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        gre.n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            sf0 sf0Var = this.a;
            char[] cArr = sf0Var.b;
            char[] cArr2 = sf0Var.b;
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
