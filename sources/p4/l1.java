package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class l1 {
    public static final e2.b1 k;
    public static final l1 l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final e2.b1 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = b1Var;
        l = new l1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.m0.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public l1(e2.b1 b1Var, boolean z9, long j3, long j10, long j11, int i7, long j12, long j13, long j14, long j15) {
        ia.f(z9 == (b1Var.h != -1));
        this.a = b1Var;
        this.b = z9;
        this.c = j3;
        this.d = j10;
        this.e = j11;
        this.f = i7;
        this.g = j12;
        this.h = j13;
        this.i = j14;
        this.j = j15;
    }

    public final l1 a(boolean z9, boolean z10) {
        if (z9 && z10) {
            return this;
        }
        return new l1(this.a.b(z9, z10), z9 && this.b, this.c, z9 ? this.d : -9223372036854775807L, z9 ? this.e : 0L, z9 ? this.f : 0, z9 ? this.g : 0L, z9 ? this.h : -9223372036854775807L, z9 ? this.i : -9223372036854775807L, z9 ? this.j : 0L);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.a;
        if (i7 < 3 || !k.a(b1Var)) {
            bundle.putBundle(m, b1Var.c(i7));
        }
        boolean z9 = this.b;
        if (z9) {
            bundle.putBoolean(n, z9);
        }
        long j3 = this.c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(p, j10);
        }
        long j11 = this.e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(q, j11);
        }
        int i10 = this.f;
        if (i10 != 0) {
            bundle.putInt(r, i10);
        }
        long j12 = this.g;
        if (j12 != 0) {
            bundle.putLong(s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(t, j13);
        }
        long j14 = this.i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(u, j14);
        }
        long j15 = this.j;
        if (i7 >= 3 && j15 == 0) {
            return bundle;
        }
        bundle.putLong(v, j15);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.c == l1Var.c && this.a.equals(l1Var.a) && this.b == l1Var.b && this.d == l1Var.d && this.e == l1Var.e && this.f == l1Var.f && this.g == l1Var.g && this.h == l1Var.h && this.i == l1Var.i && this.j == l1Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.a;
        sb2.append(b1Var.b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.j, "}");
    }
}
