// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class x2f {
    public final String a;
    public final String b;
    public final boolean c;

    public x2f(String str, String str2, boolean z) {
        fre.f(str);
        this.a = str;
        fre.f(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2f)) {
            return false;
        }
        x2f x2fVar = (x2f) obj;
        return cqe.a(this.a, x2fVar.a) && cqe.a(this.b, x2fVar.b) && cqe.a(null, null) && this.c == x2fVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        fre.h(null);
        throw null;
    }
}
