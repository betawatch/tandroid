package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i9, int i10) {
        super(bArr);
        s0.s(i9, i9 + i10, bArr.length);
        this.d = i9;
        this.e = i10;
    }

    @Override // x6.s0
    public final byte i(int i9) {
        int i10 = this.e;
        if (((i10 - (i9 + 1)) | i9) >= 0) {
            return this.b[this.d + i9];
        }
        if (i9 < 0) {
            throw new ArrayIndexOutOfBoundsException(j3.r0.l(i9, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(aa.d.k(i9, i10, "Index > length: ", ", "));
    }

    @Override // x6.s0
    public final byte n(int i9) {
        return this.b[this.d + i9];
    }

    @Override // x6.s0
    public final int o() {
        return this.d;
    }

    @Override // x6.s0
    public final int p() {
        return this.e;
    }

    @Override // x6.s0
    public final void q(int i9, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i9);
    }
}
