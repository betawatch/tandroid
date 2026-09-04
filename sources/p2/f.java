package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final i0 l;
    public final i0 m;
    public final a1 n;
    public final boolean o;
    public final String p;
    public final String q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        e2.d.b((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j3;
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = arrayList;
        this.i = z10;
        this.j = j13;
        this.k = j14;
        this.l = i0.v(arrayList2);
        this.m = i0.v(arrayList3);
        this.n = i0.B(new f11(7), arrayList4);
        this.o = z11;
        this.p = str2;
        this.q = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && this.i == fVar.i && this.j == fVar.j && this.k == fVar.k && this.o == fVar.o && Objects.equals(this.a, fVar.a) && Objects.equals(this.b, fVar.b) && Objects.equals(this.c, fVar.c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.l, fVar.l) && Objects.equals(this.m, fVar.m) && Objects.equals(this.n, fVar.n) && Objects.equals(this.p, fVar.p) && Objects.equals(this.q, fVar.q);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q);
    }
}
