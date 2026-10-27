package p2;

import a8.yb;
import android.net.Uri;
import f9.i0;
import f9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.dv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g {
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
    public final s1 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        yb.g((uri == null || uri2 == null) && !(uri == null && uri2 == null));
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
        this.l = i0.u(arrayList2);
        this.m = i0.u(arrayList3);
        this.n = i0.A(new dv(18), arrayList4);
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && this.o == gVar.o && this.r == gVar.r && this.s == gVar.s && Objects.equals(this.a, gVar.a) && Objects.equals(this.b, gVar.b) && Objects.equals(this.c, gVar.c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.l, gVar.l) && Objects.equals(this.m, gVar.m) && Objects.equals(this.n, gVar.n) && Objects.equals(this.p, gVar.p) && Objects.equals(this.q, gVar.q) && Objects.equals(this.t, gVar.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
