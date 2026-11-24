// default package

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uq6 {
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
    public final qm5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mm5 g;
    public final byte[] h;

    static {
        String str = g8c.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public uq6(tq6 tq6Var) {
        gre.p((tq6Var.f && tq6Var.b == null) ? false : true);
        UUID uuid = tq6Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = tq6Var.b;
        this.c = tq6Var.c;
        this.d = tq6Var.d;
        this.f = tq6Var.f;
        this.e = tq6Var.e;
        this.g = tq6Var.g;
        byte[] bArr = tq6Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq6)) {
            return false;
        }
        uq6 uq6Var = (uq6) obj;
        return this.a.equals(uq6Var.a) && Objects.equals(this.b, uq6Var.b) && Objects.equals(this.c, uq6Var.c) && this.d == uq6Var.d && this.f == uq6Var.f && this.e == uq6Var.e && this.g.equals(uq6Var.g) && Arrays.equals(this.h, uq6Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
