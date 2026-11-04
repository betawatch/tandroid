package yb;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends d {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public f(int i3, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 > i3 || i14 + i12 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = i3;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    @Override // yb.d
    public final byte[] a() {
        int i3 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        if (i3 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i3 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f * i11) + this.e;
        if (i3 == i11) {
            System.arraycopy(null, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(null, i13, bArr, i14 * i3, i3);
            i13 += i11;
        }
        return bArr;
    }

    @Override // yb.d
    public final byte[] b(int i3, byte[] bArr) {
        if (i3 < 0 || i3 >= this.b) {
            throw new IllegalArgumentException(p1.i(i3, "Requested row is outside the image: "));
        }
        int i10 = this.a;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(null, ((i3 + this.f) * this.c) + this.e, bArr, 0, i10);
        return bArr;
    }
}
