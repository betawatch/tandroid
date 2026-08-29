package z6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // z6.s0
    public final byte i(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(j7.l1.k(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a4.w.k(i10, i11, "Index > length: ", ", "));
    }

    @Override // z6.s0
    public final byte n(int i10) {
        return this.b[this.d + i10];
    }

    @Override // z6.s0
    public final int o() {
        return this.d;
    }

    @Override // z6.s0
    public final int p() {
        return this.e;
    }

    @Override // z6.s0
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
