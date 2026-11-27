// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pee extends gfe {
    public final int d;
    public final int e;

    public pee(byte[] bArr, int i, int i2) {
        super(bArr);
        gfe.n(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // gfe
    public final byte h(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c00.h(i, i2, "Index > length: ", ", "));
    }

    @Override // gfe
    public final byte i(int i) {
        return this.b[this.d + i];
    }

    @Override // gfe
    public final int j() {
        return this.d;
    }

    @Override // gfe
    public final int k() {
        return this.e;
    }

    @Override // gfe
    public final void l(int i, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
