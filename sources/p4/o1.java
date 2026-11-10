package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o1 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final IBinder f;
    public final Bundle g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
        q = Integer.toString(8, 36);
        r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.a = i7;
        this.b = 1010001300;
        this.c = 9;
        this.d = str;
        this.e = "";
        this.f = c1Var;
        this.g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.a == o1Var.a && this.b == o1Var.b && this.c == o1Var.c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.e, o1Var.e) && Objects.equals(this.f, o1Var.f) && Objects.equals(this.h, o1Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, null, this.f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.b + " interfaceVersion=" + this.c + " service=" + this.e + " IMediaSession=" + this.f + " extras=" + this.g + "}";
    }
}
