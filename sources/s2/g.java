package s2;

import a8.ia;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.un0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    public final t1 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j3;
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = arrayList;
        this.i = z9;
        this.j = j13;
        this.k = j14;
        this.l = i0.q(arrayList2);
        this.m = i0.q(arrayList3);
        this.n = i0.w(new un0(12), arrayList4);
        this.o = z10;
        this.p = str2;
        this.q = str3;
        this.r = j15;
        this.s = j16;
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
