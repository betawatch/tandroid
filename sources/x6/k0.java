package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 extends m0 {
    public final char[] e;

    public k0(j0 j0Var) {
        super(j0Var, (Character) null);
        this.e = new char[512];
        char[] cArr = j0Var.b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i9 = 0; i9 < 256; i9++) {
            char[] cArr2 = this.e;
            cArr2[i9] = cArr[i9 >>> 4];
            cArr2[i9 | 256] = cArr[i9 & 15];
        }
    }

    @Override // x6.m0
    public final void a(StringBuilder sb2, byte[] bArr, int i9) {
        a.m(0, i9, bArr.length);
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
