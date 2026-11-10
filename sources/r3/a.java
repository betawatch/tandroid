package r3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.u;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a implements p0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.a = i7;
        this.b = str;
        this.c = str2;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.g = i13;
        this.h = bArr;
    }

    public static a d(x xVar) {
        int m10 = xVar.m();
        String n10 = s0.n(xVar.y(xVar.m(), StandardCharsets.US_ASCII));
        String y10 = xVar.y(xVar.m(), StandardCharsets.UTF_8);
        int m11 = xVar.m();
        int m12 = xVar.m();
        int m13 = xVar.m();
        int m14 = xVar.m();
        int m15 = xVar.m();
        byte[] bArr = new byte[m15];
        xVar.k(0, m15, bArr);
        return new a(m10, n10, y10, m11, m12, m13, m14, bArr);
    }

    @Override // e2.p0
    public final /* synthetic */ u a() {
        return null;
    }

    @Override // e2.p0
    public final void b(n0 n0Var) {
        n0Var.a(this.a, this.h);
    }

    @Override // e2.p0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
