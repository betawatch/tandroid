package z5;

import java.util.Arrays;
import q6.m;
import tg.x;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        return m.l(null, null) && this.a == bVar.a && m.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
