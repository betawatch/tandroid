// default package

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class us6 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final qo5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mo5 g;
    public final byte[] h;

    static {
        String str = hac.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public us6(ts6 ts6Var) {
        jte.p((ts6Var.f && ts6Var.b == null) ? false : true);
        UUID uuid = ts6Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = ts6Var.b;
        this.c = ts6Var.c;
        this.d = ts6Var.d;
        this.f = ts6Var.f;
        this.e = ts6Var.e;
        this.g = ts6Var.g;
        byte[] bArr = ts6Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us6)) {
            return false;
        }
        us6 us6Var = (us6) obj;
        return this.a.equals(us6Var.a) && Objects.equals(this.b, us6Var.b) && Objects.equals(this.c, us6Var.c) && this.d == us6Var.d && this.f == us6Var.f && this.e == us6Var.e && this.g.equals(us6Var.g) && Arrays.equals(this.h, us6Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
