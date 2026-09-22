package p3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.Arrays;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c implements o0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // b2.o0
    public final /* synthetic */ s a() {
        return null;
    }

    @Override // b2.o0
    public final void b(m0 m0Var) {
        String str = this.b;
        if (str != null) {
            m0Var.a = str;
        }
    }

    @Override // b2.o0
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
        return a4.a.o(this.a.length, "\"", a4.a.x("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
