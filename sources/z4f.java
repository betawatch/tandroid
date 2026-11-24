// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z4f {
    public final String a;
    public final String b;
    public final boolean c;

    public z4f(String str, String str2, boolean z) {
        ite.f(str);
        this.a = str;
        ite.f(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4f)) {
            return false;
        }
        z4f z4fVar = (z4f) obj;
        return fse.a(this.a, z4fVar.a) && fse.a(this.b, z4fVar.b) && fse.a(null, null) && this.c == z4fVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ite.h(null);
        throw null;
    }
}
