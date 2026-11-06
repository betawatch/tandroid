package s3;

import e2.n0;
import e2.p0;
import e2.u;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c implements p0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // e2.p0
    public final /* synthetic */ u a() {
        return null;
    }

    @Override // e2.p0
    public final void b(n0 n0Var) {
        String str = this.b;
        if (str != null) {
            n0Var.a = str;
        }
    }

    @Override // e2.p0
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
        return a8.p0.n(this.a.length, "\"", com.google.android.recaptcha.internal.a.n("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
