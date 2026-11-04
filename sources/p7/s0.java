package p7;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final int d;
    public final int e;

    public s0(byte[] bArr, int i3, int i10) {
        super(bArr);
        t0.n(i3, i3 + i10, bArr.length);
        this.d = i3;
        this.e = i10;
    }

    @Override // p7.t0
    public final byte h(int i3) {
        int i10 = this.e;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.b[this.d + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(p1.i(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.n(i3, i10, "Index > length: ", ", "));
    }

    @Override // p7.t0
    public final byte i(int i3) {
        return this.b[this.d + i3];
    }

    @Override // p7.t0
    public final int j() {
        return this.d;
    }

    @Override // p7.t0
    public final int k() {
        return this.e;
    }

    @Override // p7.t0
    public final void l(int i3, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i3);
    }
}
