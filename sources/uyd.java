// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uyd extends pzd {
    public final int d;

    public uyd(int i, byte[] bArr) {
        super(bArr);
        pzd.k(0, i, bArr.length);
        this.d = i;
    }

    @Override // pzd
    public final byte h(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c00.h(i, i2, "Index > length: ", ", "));
    }

    @Override // pzd
    public final byte i(int i) {
        return this.b[i];
    }

    @Override // pzd
    public final int j() {
        return this.d;
    }
}
