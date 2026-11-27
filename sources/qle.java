// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qle extends jne {
    public final int e;
    public final int f;

    public qle(byte[] bArr, int i, int i2) {
        super(bArr);
        jne.l(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // jne
    public final byte h(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // jne
    public final int i() {
        return this.f;
    }

    @Override // jne
    public final byte k(int i) {
        return this.b[this.e + i];
    }

    @Override // jne
    public final int m() {
        return this.e;
    }
}
