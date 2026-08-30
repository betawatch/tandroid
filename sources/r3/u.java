package r3;

import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public u(int i10, int i11, int i12, byte[] bArr) {
        this.a = i10;
        this.b = bArr;
        this.c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.a == uVar.a && this.c == uVar.c && this.d == uVar.d && Arrays.equals(this.b, uVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
