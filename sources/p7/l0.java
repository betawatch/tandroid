package p7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 extends n0 {
    public final char[] e;

    public l0(k0 k0Var) {
        super(k0Var, (Character) null);
        this.e = new char[512];
        char[] cArr = k0Var.b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i3 = 0; i3 < 256; i3++) {
            char[] cArr2 = this.e;
            cArr2[i3] = cArr[i3 >>> 4];
            cArr2[i3 | 256] = cArr[i3 & 15];
        }
    }

    @Override // p7.n0
    public final void a(StringBuilder sb2, byte[] bArr, int i3) {
        a.m(0, i3, bArr.length);
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
