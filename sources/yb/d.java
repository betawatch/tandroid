package yb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public final int a;
    public final int b;

    public d(int i3, int i10) {
        this.a = i3;
        this.b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i3, byte[] bArr);

    public final String toString() {
        int i3 = this.a;
        byte[] bArr = new byte[i3];
        int i10 = this.b;
        StringBuilder sb2 = new StringBuilder((i3 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
