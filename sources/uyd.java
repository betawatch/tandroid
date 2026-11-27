// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
