package q7;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i7, int i10) {
        super(bArr);
        s0.n(i7, i7 + i10, bArr.length);
        this.d = i7;
        this.e = i10;
    }

    @Override // q7.s0
    public final byte f(int i7) {
        int i10 = this.e;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.b[this.d + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(jg.g.j(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a8.p0.m(i7, i10, "Index > length: ", ", "));
    }

    @Override // q7.s0
    public final byte i(int i7) {
        return this.b[this.d + i7];
    }

    @Override // q7.s0
    public final int j() {
        return this.d;
    }

    @Override // q7.s0
    public final int k() {
        return this.e;
    }

    @Override // q7.s0
    public final void l(int i7, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i7);
    }
}
