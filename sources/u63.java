// default package

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u63 {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final byte b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final byte h;

    static {
        cr6.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u63(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        gre.f(j >= 0);
        gre.f(j >= 0);
        gre.f(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }

    public final t63 a() {
        t63 t63Var = new t63();
        t63Var.a = this.a;
        t63Var.b = this.b;
        t63Var.c = this.c;
        t63Var.d = this.d;
        t63Var.e = this.e;
        t63Var.f = this.f;
        t63Var.g = this.g;
        t63Var.h = this.h;
        return t63Var;
    }

    public final u63 b(long j) {
        long j2 = this.f;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new u63(this.a, this.b, this.c, this.d, this.e + j, j3, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        byte b = this.b;
        if (b == 1) {
            str = "GET";
        } else if (b == 2) {
            str = "POST";
        } else {
            if (b != 3) {
                sdb.a();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return de9.l(sb, this.h, "]");
    }

    public u63(long j, Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, j, -1L, null, 0);
    }
}
