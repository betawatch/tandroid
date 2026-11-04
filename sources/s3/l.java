package s3;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends i {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public l(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.b == lVar.b && this.c == lVar.c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f, lVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
