package s2;

import a8.ma;
import android.net.Uri;
import h9.i0;
import h9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ow0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final i0 l;
    public final i0 m;
    public final s1 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public h(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        ma.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
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
        this.l = i0.q(arrayList2);
        this.m = i0.q(arrayList3);
        this.n = i0.w(new ow0(11), arrayList4);
        this.o = z11;
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
