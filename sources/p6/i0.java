package p6;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i0 {
    public final String a;
    public final String b;
    public final boolean c;

    public i0(String str, String str2, boolean z10) {
        m.e(str);
        this.a = str;
        m.e(str2);
        this.b = str2;
        this.c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return m.k(this.a, i0Var.a) && m.k(this.b, i0Var.b) && m.k(null, null) && this.c == i0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        m.g(null);
        throw null;
    }
}
