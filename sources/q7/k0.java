package q7;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.e;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | 256] = cArr[i7 & 15];
        }
    }

    @Override // q7.m0
    public final void a(StringBuilder sb2, byte[] bArr, int i7) {
        a.m(0, i7, bArr.length);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
