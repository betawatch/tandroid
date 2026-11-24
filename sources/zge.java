// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zge extends sie {
    public final int e;
    public final int f;

    public zge(byte[] bArr, int i, int i2) {
        super(bArr);
        sie.l(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // sie
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

    @Override // sie
    public final int i() {
        return this.f;
    }

    @Override // sie
    public final byte k(int i) {
        return this.b[this.e + i];
    }

    @Override // sie
    public final int m() {
        return this.e;
    }
}
