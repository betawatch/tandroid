package q3;

import d2.p0;
import d2.r0;
import d2.u0;
import d2.v;
import g2.y;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements r0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public a(int i3, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.a = i3;
        this.b = str;
        this.c = str2;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.g = i13;
        this.h = bArr;
    }

    public static a d(y yVar) {
        int m10 = yVar.m();
        String n4 = u0.n(yVar.y(yVar.m(), StandardCharsets.US_ASCII));
        String y9 = yVar.y(yVar.m(), StandardCharsets.UTF_8);
        int m11 = yVar.m();
        int m12 = yVar.m();
        int m13 = yVar.m();
        int m14 = yVar.m();
        int m15 = yVar.m();
        byte[] bArr = new byte[m15];
        yVar.k(0, m15, bArr);
        return new a(m10, n4, y9, m11, m12, m13, m14, bArr);
    }

    @Override // d2.r0
    public final void a(p0 p0Var) {
        p0Var.a(this.a, this.h);
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
