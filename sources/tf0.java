// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tf0 extends vf0 {
    public final char[] e;

    public tf0(sf0 sf0Var) {
        super(sf0Var, (Character) null);
        this.e = new char[512];
        char[] cArr = sf0Var.b;
        gre.f(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // vf0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        gre.n(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
