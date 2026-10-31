package p3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements t0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    @Override // b2.t0
    public final void b(r0 r0Var) {
        String str = this.b;
        if (str != null) {
            r0Var.a = str;
        }
    }

    @Override // b2.t0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return g.p(g.v("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
