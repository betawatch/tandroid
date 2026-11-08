package q6;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i0 {
    public final String a;
    public final String b;
    public final boolean c;

    public i0(String str, String str2, boolean z9) {
        m.e(str);
        this.a = str;
        m.e(str2);
        this.b = str2;
        this.c = z9;
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
