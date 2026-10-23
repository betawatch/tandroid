package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.jg0;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class h {
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
    public final n0 l;
    public final n0 m;
    public final x1 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        u6.g((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j10;
        this.e = j11;
        this.f = j12;
        this.g = j13;
        this.h = arrayList;
        this.i = z10;
        this.j = j14;
        this.k = j15;
        this.l = n0.u(arrayList2);
        this.m = n0.u(arrayList3);
        this.n = n0.A(new jg0(14), arrayList4);
        this.o = z11;
        this.p = str2;
        this.q = str3;
        this.r = j16;
        this.s = j17;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g && this.i == hVar.i && this.j == hVar.j && this.k == hVar.k && this.o == hVar.o && this.r == hVar.r && this.s == hVar.s && Objects.equals(this.a, hVar.a) && Objects.equals(this.b, hVar.b) && Objects.equals(this.c, hVar.c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.l, hVar.l) && Objects.equals(this.m, hVar.m) && Objects.equals(this.n, hVar.n) && Objects.equals(this.p, hVar.p) && Objects.equals(this.q, hVar.q) && Objects.equals(this.t, hVar.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
