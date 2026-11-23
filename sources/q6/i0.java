package q6;

import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i0 {
    public final String a;
    public final String b;
    public final boolean c;

    public i0(String str, String str2, boolean z10) {
        m.f(str);
        this.a = str;
        m.f(str2);
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
        return m.l(this.a, i0Var.a) && m.l(this.b, i0Var.b) && m.l(null, null) && this.c == i0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
