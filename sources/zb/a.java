package zb;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements Cloneable {
    public static final int[] c = new int[0];
    public int b = 0;
    public int[] a = c;

    public final void a(boolean z10) {
        c(this.b + 1);
        if (z10) {
            int[] iArr = this.a;
            int i3 = this.b;
            int i10 = i3 / 32;
            iArr[i10] = (1 << (i3 & 31)) | iArr[i10];
        }
        this.b++;
    }

    public final void b(int i3, int i10) {
        if (i10 < 0 || i10 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i11 = this.b;
        c(i11 + i10);
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            if (((1 << i12) & i3) != 0) {
                int[] iArr = this.a;
                int i13 = i11 / 32;
                iArr[i13] = iArr[i13] | (1 << (i11 & 31));
            }
            i11++;
        }
        this.b = i11;
    }

    public final void c(int i3) {
        if (i3 > this.a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i3 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.a = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.a.clone();
        int i3 = this.b;
        a aVar = new a();
        aVar.a = iArr;
        aVar.b = i3;
        return aVar;
    }

    public final boolean d(int i3) {
        return ((1 << (i3 & 31)) & this.a[i3 / 32]) != 0;
    }

    public final int e() {
        return (this.b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && Arrays.equals(this.a, aVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public final String toString() {
        int i3 = this.b;
        StringBuilder sb2 = new StringBuilder((i3 / 8) + i3 + 1);
        for (int i10 = 0; i10 < this.b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
