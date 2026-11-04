package r3;

import a1.g;
import d2.p0;
import d2.r0;
import d2.v;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements r0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // d2.r0
    public final void a(p0 p0Var) {
        String str = this.b;
        if (str != null) {
            p0Var.a = str;
        }
    }

    @Override // d2.r0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // d2.r0
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
        return g.o(this.a.length, "\"", com.google.android.recaptcha.internal.a.n("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
