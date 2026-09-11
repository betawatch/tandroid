package w5;

import java.util.Arrays;
import n6.l;
import n7.z0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        z0 z0Var = new z0(21, false);
        z0Var.b = Boolean.FALSE;
        c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.a = ((Boolean) z0Var.b).booleanValue();
        this.b = (String) z0Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.l(null, null) && this.a == bVar.a && l.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
