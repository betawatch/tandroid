package z5;

import java.util.Arrays;
import q6.m;
import tg.x;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        x xVar = new x(9, (byte) 0);
        xVar.b = Boolean.FALSE;
        c = new b(xVar);
    }

    public b(x xVar) {
        this.a = ((Boolean) xVar.b).booleanValue();
        this.b = (String) xVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.k(null, null) && this.a == bVar.a && m.k(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
